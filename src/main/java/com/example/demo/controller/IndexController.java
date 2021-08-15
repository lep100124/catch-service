package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.ChostEntity;
import com.example.demo.model.ApiResult;
import com.example.demo.server.ChostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author: syl
 * @Date: 2021/8/15 10:14
 * @Description:
 */
@RestController
public class IndexController {

    @Autowired
    private RedisTemplate<String,  String> redisTemplate;
    @Autowired
    private ChostService chostService;

    @GetMapping("index")
    public ApiResult index(){

        return ApiResult.builder().code(0).msg("success").build();
    }

    @GetMapping("redisTest")
    public ApiResult redisTest(@RequestParam("key") String key){
        String value = redisTemplate.opsForValue().get(key);
        return ApiResult.builder().code(0).msg(value).build();
    }

    @GetMapping("getChost")
    public ApiResult getChost(){
        ChostEntity host = chostService.getById(1);
        return ApiResult.success(JSON.parseObject(JSON.toJSONString(host)));
    }


}
