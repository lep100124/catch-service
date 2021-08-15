package com.example.demo.server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.bean.ChostEntity;
import com.example.demo.dao.ChostMapper;
import com.example.demo.server.ChostService;
import org.springframework.stereotype.Service;

/**
 * @author: syl
 * @Date: 2021/8/15 11:00
 * @Description:
 */
@Service
public class ChostServiceImpl extends ServiceImpl<ChostMapper,ChostEntity> implements ChostService {
}
