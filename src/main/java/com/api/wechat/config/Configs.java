package com.api.wechat.config;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/25
 * 包    名：com.api.wechat.config
 * 描    述：项目整体配置文件
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class Configs {

    /**
     * 短信验证码位数
     */
    public static final int configCodeMessageMax = 6;

    /**
     * 短信验证码失效时间
     */
    public static final int configCodeMessageRedisMax = 120;

    /**
     * 用户默认生成的名称前缀位数
     */
    public static final int userBaseNameMax = 7;

    /**
     * redis存储默认失效时间(分钟)
     */
    public static final int redisDefaultMinute = 30;
}
