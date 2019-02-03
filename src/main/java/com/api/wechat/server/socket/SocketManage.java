package com.api.wechat.server.socket;

import com.api.wechat.connect.socket.SocketTransmit;
import com.api.wechat.util.RedisUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/22
 * 包    名：com.api.wechat.server.socket
 * 描    述：socket管理类
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public class SocketManage {
    //构造单例
    private static SocketManage socketManage;
    private SocketManage(){
        //初始化容器
        socketMap = new HashMap<>();
    }
    public static SocketManage getInstance(){
        if (socketManage==null)socketManage=new SocketManage();
        return socketManage;
    }

    //构造socket管理类
    private Map<String,MessageSocket> socketMap;

    @Resource
    private RedisUtils redisUtils;

    /**
     * 群发消息
     * @param socketTransmits 消息对象
     */
    public void pushUsers(SocketTransmit... socketTransmits){
    }

    /**
     * 更新key
     * @param oldKey 旧key
     * @param newKey 新key
     * @param messageSocket 新对象
     */
    public void refreshKey(String oldKey,String newKey,MessageSocket messageSocket){
        if (!socketMap.containsKey(oldKey))return;
        socketMap.remove(oldKey);
        socketMap.put(newKey,messageSocket);
    }

    /**
     * 更新key
     * @param oldKey 旧key
     * @param newKey 新key
     */
    public void refreshKey(String oldKey,String newKey){
        MessageSocket messageSocket = socketMap.get(oldKey);
        if (messageSocket==null)return;
        socketMap.remove(oldKey);
        socketMap.put(newKey,messageSocket);
    }

    /**
     * 获取到一个Socket对象
     * @param userId 用户id(key)
     * @return MessageSocket
     */
    public MessageSocket to(int userId){
        return socketMap.get(userId);
    }

    /**
     * 销毁一个Socket
     * @param userId 销毁id
     */
    public void destroySocket(String userId){
        MessageSocket messageSocket = socketMap.get(userId);
        if (messageSocket!=null){
            messageSocket.destroyIn();
            socketMap.remove(userId);
        }
    }

    /**
     * 初始化一个Socket
     * @param key key值(用户id)
     * @param messageSocket socket对象,不能为空
     */
    public void in(String key,MessageSocket messageSocket){
        if (messageSocket!=null){
            socketMap.put(key,messageSocket);
        }
    }

    /**
     * 当前同时在线人数
     * @return int
     */
    public int size(){
        return socketMap.size();
    }

    /**
     * 消息存储进redis
     * @param socketTransmit 一条消息
     */
    @SuppressWarnings("unchecked")
    public void setSocketMessage(SocketTransmit socketTransmit){
        if (socketTransmit==null)return;
        List<SocketTransmit> socketTransmits = getSocketMessage(String.valueOf(socketTransmit.getSocketRelation().getToId()));
        socketTransmits.add(socketTransmit);
        redisUtils.addToRedis(String.valueOf(socketTransmit.getSocketRelation().getToId()), socketTransmits);
    }

    /**
     * 获取缓存的消息
     * @param userId 用户id
     * @return 消息列表集合
     */
    @SuppressWarnings("unchecked")
    public List<SocketTransmit> getSocketMessage(String userId){
        if (userId==null)return null;
        List<SocketTransmit> socketTransmits = (List<SocketTransmit>) redisUtils.getFromRedis(userId);
        if (socketTransmits==null)socketTransmits = new ArrayList<>();
        return socketTransmits;
    }

}
