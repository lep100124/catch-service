package com.example.demo.model;

import com.alibaba.fastjson.JSONObject;
import lombok.Builder;
import lombok.Data;

/**
 * @author: syl
 * @Date: 2021/8/15 10:16
 * @Description: 前后端交互
 */
@Data
@Builder
public class ApiResult {

    /**
     * =0 请求成功  =1请求失败
     */
    private int code;

    private String msg;

    /**
     * 后端返回给前端的数据
     */
    private JSONObject json;


    public static ApiResult success(JSONObject json){
        return ApiResult.builder().msg("成功").code(0).json(json).build();
    }



}
