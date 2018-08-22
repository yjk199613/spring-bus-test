/*
 * Copyright (C), 2013-2018, 天津大海云科技有限公司
 */
package com.hiynn.resplatform.api.service.impl;

import com.hiynn.resplatform.api.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * 测试
 *
 * @author kehaiyong
 * @date 2018/7/13 10:35
 * @modified By kehaiyong
 * @since 1.0.0
 */
@Service
public class TestServiceImpl implements ITestService {

    @Override
    public String testTwo() {
        return "我是api";
    }
}

