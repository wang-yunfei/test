package com.mr.malldemo.controller;

import com.mr.malldemo.entity.OmsEntity;
import com.mr.malldemo.service.OmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Oms")
public class OmsController {

    @Autowired
    private OmsService omsService;

    @RequestMapping("getList")
    @ResponseBody
    public List<OmsEntity> omsList(){
        List<OmsEntity> list=omsService.omsList();
        System.out.println(123);
        return list;
    }
}
