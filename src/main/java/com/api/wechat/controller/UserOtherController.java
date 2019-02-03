package com.api.wechat.controller;

import com.api.wechat.controller.norm.UserOtherControllerNorm;
import com.api.wechat.mapper.UserRelationMapper;
import com.api.wechat.net.request.IdRequest;
import com.api.wechat.net.request.PutUserRequest;
import com.api.wechat.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ================================================
 * 作    者：贾恒飞 >>> 17515250730@163.com
 * 项    目：wechat
 * 日    期：2019/1/18
 * 包    名：com.api.wechat.controller
 * 描    述：用户其他(用户关系维护等)操作接口
 * Create by zFox from IntelliJ-2019.5
 * ================================================
 */
@RestController
@RequestMapping("/*.uo")
public class UserOtherController implements UserOtherControllerNorm {

    @Resource
    UserService userService;

    @Override
    public String putUser(PutUserRequest request) {

        return null;
    }

    @Override
    public String userUserLists(IdRequest request) {
        return null;
    }
}
