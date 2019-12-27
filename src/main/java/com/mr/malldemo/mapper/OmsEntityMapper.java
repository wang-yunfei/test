package com.mr.malldemo.mapper;


import com.mr.malldemo.entity.OmsEntity;

import java.util.List;

public interface OmsEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsEntity record);

    int insertSelective(OmsEntity record);

    OmsEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsEntity record);

    int updateByPrimaryKey(OmsEntity record);



    List<OmsEntity> getList();
}