package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: syl
 * @Date: 2021/8/15 10:54
 * @Description:
 */
@Data
@TableName("c_host")
public class ChostEntity {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField(value = "host")
    private String host;

    @TableField(value = "port")
    private String port;
}
