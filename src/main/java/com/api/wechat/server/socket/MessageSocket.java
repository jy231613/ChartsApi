package com.api.wechat.server.socket;

import com.alibaba.fastjson.JSON;
import com.api.wechat.connect.socket.SocketTransmit;
import com.api.wechat.connect.socket.bean.MessageType;
import com.api.wechat.connect.socket.bean.SocketHeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/21
 * 包    名：com.api.wechat.server.socket
 * 描    述：每一个连接的socket对象
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class MessageSocket extends Thread {
    private Socket socket;
    private String key;

    /**
     * 初始化传入一个Socket对象
     *
     * @param key    默认key值
     * @param socket socket对象
     */
    public MessageSocket(String key, Socket socket) {
        this.socket = socket;
        this.key = key;
    }

    //是否是第一次消息
    private SocketHeader socketHeader;

    private boolean destroy = false;

    @Override
    public void run() {
        super.run();
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            String line = null;
            while ((line = bf.readLine()) != null || !destroy) {
                //处理接收的消息
                if (socketHeader == null) {
                    //初始化socket头部信息
                    socketHeader = JSON.parseObject(line, SocketHeader.class);
                    System.out.println("用户初始化成功:>>>" + socketHeader.getPhoneName() + " >>> id== " + socketHeader.getUserId());
                    //初始化当前socket
                    SocketManage.getInstance().refreshKey(this.key, socketHeader.getUserId());
                    //回传离线阶段的未回复消息
                    List<SocketTransmit> socketTransmits = SocketManage.getInstance().getSocketMessage(socketHeader.getUserId());
                    SocketManage.getInstance().to(Integer.valueOf(socketHeader.getUserId())).write(JSON.toJSONString(socketTransmits));
                } else {
                    SocketTransmit socketTransmit = JSON.parseObject(line, SocketTransmit.class);
                    if (socketTransmit == null) continue;
                    MessageSocket messageSocket = SocketManage.getInstance().to(socketTransmit.getSocketRelation().getToId());
                    switch (socketTransmit.getSocketType()) {
                        case MessageType.MESSAGE_USER_GROUP:
                            //群组单独计算
                            break;
                        case MessageType.MESSAGE_USER_USER:
                            //点对点消息
                            if (messageSocket != null) {
                                messageSocket.write(line);
                            } else {
                                //添加到缓存
                                SocketManage.getInstance().setSocketMessage(socketTransmit);
                            }
                            break;
                        case MessageType.MESSAGE_SYSTEM_PUSH:
                            //系统消息
                            this.close();//当前关闭
                            break;
                        default:
                            //其他,不缓存,如果在线原样发送,如果不在线,则通知其不在线
                            if (messageSocket != null) messageSocket.write(line);
                            break;
                    }
                }
            }
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭当前连接
     */
    private void close() {
        SocketManage.getInstance().destroySocket(socketHeader.getUserId());
        destroyIn();
    }

    /**
     * 销毁
     */
    public void destroyIn() {
        destroy = true;
    }

    /**
     * 输出数据
     *
     * @param str 要输出的数据
     */
    public void write(String str) {
        try {
            String out = str + "\n";//write方法输入字符串结尾一定要加‘\n’
            socket.getOutputStream().write(out.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
