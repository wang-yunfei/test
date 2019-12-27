package com.mr.malldemo.service.impl;

import com.mr.malldemo.entity.OmsEntity;
import com.mr.malldemo.mapper.OmsEntityMapper;
import com.mr.malldemo.service.OmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OmsServiceImpl  implements OmsService {

    @Autowired
    private OmsEntityMapper omsEntityMapper;

    @Override
    public List<OmsEntity> omsList() {
        return  omsEntityMapper.getList();
    }
}
