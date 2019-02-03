package com.api.wechat.net;

import com.alibaba.fastjson.JSON;
import com.api.wechat.config.Codes;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/24
 * 包    名：com.api.wechat.net
 * 描    述：结果集返回
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class Results {

    /**
     * 成功
     * @param data 数据
     * @param <T> 数据类型
     * @return 封装的字符串json
     */
    public static <T> String ok(T data){
        return getBean(Codes.success.code,Codes.success.msg,data);
    }

    /**
     * 失败
     * @return 封装的错误信息json
     */
    public static String no(){
        return getBean(Codes.defeated.code,Codes.defeated.msg,null);
    }

    /**
     * 失败
     * @param codes 错误对象
     * @return 封装的错误信息json
     */
    public static String no(Codes codes){
        return getBean(codes.code,codes.msg,null);
    }

    /**
     * 失败
     * @param code 错误码
     * @param msg 错误信息
     * @return 封装的错误信息json
     */
    public static String no(int code,String msg){
        return getBean(code,msg,null);
    }

    /**
     * 获取一个返回bean对象
     * @param code 返回码
     * @param msg 返回信息
     * @param data 返回数据
     * @param <T> 返回数据类型
     * @return json序列化结果集
     */
    private static <T> String getBean(int code,String msg,T data){
        NetBean<T> netBean = new NetBean<>();
        netBean.setCode(code);
        netBean.setMsg(msg);
        netBean.setData(data);
        return JSON.toJSONString(netBean);
    }

}
