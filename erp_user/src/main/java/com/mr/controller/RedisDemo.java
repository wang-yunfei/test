package com.mr.controller;

import com.mr.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("redisdemo")
public class RedisDemo {
    @Autowired
    private RedisUtils<Map<String ,Object>> redisUtils;

    @GetMapping("/testRedis")
    public Map<String,Object> testRedis(){
        Map<String, Object> goods = new HashMap<>();
        goods.put("aaa","pppp");
        goods.put("bbb","ooo");
        goods.put("jjj","iii");
        redisUtils.setHash("sb","akjfba",goods);
        Map<String, Object> map = redisUtils.getHash("sb", "akjfba");
        return map;
    }

}
