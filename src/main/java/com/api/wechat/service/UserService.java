package com.api.wechat.service;

import com.api.wechat.model.UserInfo;
import com.api.wechat.model.UserRelation;

import java.util.List;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/18
 * 包    名：com.api.wechat.service
 * 描    述：用户相关服务接口
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public interface UserService {

    /**
     * 新增一个用户信息
     * @param userInfo 用户信息对象
     */
    void addUserInfo(UserInfo userInfo);

    /**
     * 新增一条用户关系信息
     * @param userRelation 用户关系
     */
    void establishUserRelation(UserRelation userRelation);

    /**
     * 删除一个用户及其相关的所有(物理删除)
     * @param userId 用户id
     */
    void delUser(int userId);

    /**
     * 根据用户手机号和密码查询用户信息
     * @param phone 手机号
     * @param password 密码
     * @return 用户信息
     */
    UserInfo selectInfoByPhoneAndPassword(String phone,String password);

    /**
     * 根据用户id查询用户信息
     * @param userId 用户id
     * @return 用户信息
     */
    UserInfo selectInfoByUserId(int userId);

    /**
     * 根据用户唯一账号和密码查询用户信息
     * @param chartN 唯一账号
     * @param Password 密码
     * @return 用户信息
     */
    UserInfo selectInfoByChartNAndPassword(String chartN,String Password);

    /**
     * 根据用户唯一账号查询用户信息
     * @param chartN 唯一账号
     * @return 用户信息
     */
    UserInfo selectInfoByChartN(String chartN);

    /**
     * 根据用户手机号查询用户信息
     * @param phone 手机号
     * @return 用户信息
     */
    UserInfo selectInfoByPhone(String phone);

    /**
     * 查询此账号是否存在
     * @param chartN 账号
     * @return true存在
     */
    boolean chartNIsHave(String chartN);

    /**
     * 查询此手机号是否存在
     * @param phone 手机号
     * @return true存在
     */
    boolean phoneIsHave(String phone);

    /**
     * 根据模糊字符查询用户列表
     * @param likeName 模糊字符(关键字)
     * @return 匹配的用户集合
     */
    List<UserInfo> selectLikeUser(String likeName);

    /**
     * 根据关系列表,查询所有相关的用户信息
     * @param myId 自己id
     * @param userRelations 用户关系列表
     * @return 匹配的用户集合
     */
    List<UserInfo> selectBySomeUserIds(int myId,List<UserRelation> userRelations);

    /**
     * 根据一个用户id查询一个用户关系列表
     * @param myId 用户自身id
     * @return 匹配的关系集合
     */
    List<UserRelation> selectUserRelations(int myId);

    /**
     * 根据关系id获取一个关系对象
     * @param relationId 关系id
     * @return 匹配的关系对象
     */
    UserRelation selectUserRelation(int relationId);

    /**
     * 根据一个用户id查询一个用户的关系列表,限
     *      只查询别人添加的自己
     * @param myId 用户自身id
     * @return 匹配的关系集合
     */
    List<UserRelation> selectUserRelationButNotPass(int myId);

    /**
     * 判断当前两个用户是否可以
     * @param myId 个人id
     * @param toId 对方id
     * @return true是好友
     */
    boolean selectUserToUser(int myId,int toId);

    /**
     * 重新修改一条用户关系
     * @param userRelation 用户关系对象
     */
    void afreshUserRelation(UserRelation userRelation);

    /**
     * 用户修改资料
     * @param userInfo 用户信息对象
     */
    void afreshUserInfo(UserInfo userInfo);

    /**
     * 重新设置用户状态
     * @param id 用户id
     * @param status 状态值
     */
    void afreshUserInfoStatus(int id,int status);

    /**
     * 重新设置关系状态
     * @param relationId 关系id
     * @param status 关系状态值
     */
    void afreshUserRelationStatus(int relationId,int status);

}
