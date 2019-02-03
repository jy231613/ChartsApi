package com.api.wechat.server.socket;

import com.api.wechat.util.StrUtil;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/21
 * 包    名：com.api.wechat.server.socket
 * 描    述：聊天线程
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class ChartService extends Thread {
    /**
     * 连接端口号
     */
    private int linkPort = 0;

    /**
     * 初始化构造
     * @param linkPort 接口号
     */
    public ChartService (int linkPort){
        this.linkPort = linkPort;
    }

    /**
     * 标致当前是否启动Socket
     */
    private boolean isStartService = true;

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(linkPort);
            while (isStartService){
                Socket socket = serverSocket.accept();
                String key = StrUtil.getUUID(true);
                MessageSocket chatSocket = new MessageSocket(key,socket);
                SocketManage.getInstance().in(key,chatSocket);
                chatSocket.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭用户连接socket
     * @param startService true开启,false关闭
     */
    public void setStartService(boolean startService) {
        isStartService = startService;
    }
}
