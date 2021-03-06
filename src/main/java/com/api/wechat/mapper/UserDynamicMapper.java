package com.api.wechat.mapper;

import com.api.wechat.model.UserDynamic;
import com.api.wechat.model.UserDynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDynamicMapper {
    int countByExample(UserDynamicExample example);

    int deleteByExample(UserDynamicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDynamic record);

    int insertSelective(UserDynamic record);

    List<UserDynamic> selectByExample(UserDynamicExample example);

    UserDynamic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDynamic record, @Param("example") UserDynamicExample example);

    int updateByExample(@Param("record") UserDynamic record, @Param("example") UserDynamicExample example);

    int updateByPrimaryKeySelective(UserDynamic record);

    int updateByPrimaryKey(UserDynamic record);
}