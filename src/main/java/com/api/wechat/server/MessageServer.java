package com.api.wechat.server;

import com.api.wechat.server.socket.ChartService;
import org.springframework.stereotype.Service;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/18
 * 包    名：com.api.wechat.server
 * 描    述：消息服务
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
@Service
public class MessageServer {

    private static final int LINK_PORT = 6666;//socket连接端口

    /**
     * 启动消息服务
     */
    public static void startMessageServer(){
        ChartService chartService = new ChartService(LINK_PORT);
        chartService.start();
    }

}
