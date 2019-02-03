package com.api.wechat.mapper;

import com.api.wechat.model.DynamicComment;
import com.api.wechat.model.DynamicCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamicCommentMapper {
    int countByExample(DynamicCommentExample example);

    int deleteByExample(DynamicCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DynamicComment record);

    int insertSelective(DynamicComment record);

    List<DynamicComment> selectByExample(DynamicCommentExample example);

    DynamicComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DynamicComment record, @Param("example") DynamicCommentExample example);

    int updateByExample(@Param("record") DynamicComment record, @Param("example") DynamicCommentExample example);

    int updateByPrimaryKeySelective(DynamicComment record);

    int updateByPrimaryKey(DynamicComment record);
}