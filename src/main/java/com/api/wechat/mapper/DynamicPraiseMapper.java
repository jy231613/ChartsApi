package com.api.wechat.mapper;

import com.api.wechat.model.DynamicPraise;
import com.api.wechat.model.DynamicPraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamicPraiseMapper {
    int countByExample(DynamicPraiseExample example);

    int deleteByExample(DynamicPraiseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DynamicPraise record);

    int insertSelective(DynamicPraise record);

    List<DynamicPraise> selectByExample(DynamicPraiseExample example);

    DynamicPraise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DynamicPraise record, @Param("example") DynamicPraiseExample example);

    int updateByExample(@Param("record") DynamicPraise record, @Param("example") DynamicPraiseExample example);

    int updateByPrimaryKeySelective(DynamicPraise record);

    int updateByPrimaryKey(DynamicPraise record);
}