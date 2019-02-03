package com.api.wechat;

import com.api.wechat.server.MessageServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@MapperScan(basePackages = {"com.api.wechat.mapper"})
public class WechatApplication {
    public static void main(String[] args) {
        SpringApplication.run(WechatApplication.class, args);
        //启动聊天线程
//        MessageServer.startMessageServer();
    }
}

