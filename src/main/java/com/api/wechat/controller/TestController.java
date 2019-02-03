package com.api.wechat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/18
 * 包    名：com.api.wechat.controller
 * 描    述：测试服务
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String test(String requestStr){
        System.out.println(requestStr);
        return "hello,admin❤";
    }

}
