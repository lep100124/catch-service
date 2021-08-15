package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.bean.ChostEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: syl
 * @Date: 2021/8/15 10:56
 * @Description:
 */
@Repository
@Mapper
public interface ChostMapper extends BaseMapper<ChostEntity> {
}
