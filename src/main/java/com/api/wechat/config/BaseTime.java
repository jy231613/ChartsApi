package com.api.wechat.config;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/25
 * 包    名：com.api.wechat.config
 * 描    述：基础时间静态
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class BaseTime {
    /**
     * 一秒==毫秒
     */
    public final static long TIME_SECOND = 1000;

    /**
     * 一分钟==毫秒
     */
    public final static long TIME_MINUTE = TIME_SECOND * 60;

    /**
     * 一小时==毫秒
     */
    public final static long TIME_HOUR = TIME_MINUTE * 60;

    /**
     * 一天==毫秒
     */
    public final static long TIME_DAY = TIME_HOUR * 24;

    /**
     * 一个月(30天)==毫秒
     */
    public final static long TIME_MONTH = TIME_DAY * 30;

    /**
     * 一年==毫秒
     */
    public final static long TIME_YEAR = TIME_MONTH * 12;
}
