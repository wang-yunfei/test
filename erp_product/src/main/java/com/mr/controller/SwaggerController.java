package com.mr.controller;

import com.mr.entity.SwaggerVO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(value = "/swagger",tags = "swagger产品测试类")
@RestController
@RequestMapping("swagger")
public class SwaggerController {

    @ApiOperation(value = "/test",notes = "swagger产品测试类中测试方法",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",dataType = "String",name = "id",value = "查询String类型id",required = true),
            @ApiImplicitParam(paramType = "query",dataType = "com.mr.entity.SwaggerVO",name = "swaggerVO",value = "产品对象")
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "操作成功",response = Map.class),
            @ApiResponse(code = 500,message = "系统内部错误")
    })
    @GetMapping("/test")
    public Map<String,Object> test(String id, SwaggerVO swaggerVO){
        Map<String,Object> map = new HashMap<>();
        map.put("key","id");
        map.put("value","swaggerVO");
        return map;
    }
}
