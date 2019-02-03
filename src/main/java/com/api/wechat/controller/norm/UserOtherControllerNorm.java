package com.api.wechat.controller.norm;

import com.api.wechat.net.request.IdRequest;
import com.api.wechat.net.request.PutUserRequest;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/2/1
 * 包    名：com.api.wechat.controller.norm
 * 描    述：用户其他操作接口
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
public interface UserOtherControllerNorm {
    /**
     * 添加用户
     * @param request 请求体
     */
    String putUser(PutUserRequest request);

    /**
     * 获取用户好友列表
     * @param request 请求体
     */
    String userUserLists(IdRequest request);
}
