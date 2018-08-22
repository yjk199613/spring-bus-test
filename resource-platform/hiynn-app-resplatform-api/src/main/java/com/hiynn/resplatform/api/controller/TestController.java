/*
 * Copyright (C), 2013-2018, 天津大海云科技有限公司
 */
package com.hiynn.resplatform.api.controller;

import com.hiynn.resplatform.api.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author kehaiyong
 * @date 2018/7/13 10:34
 * @modified By kehaiyong
 * @since 1.0.0
 */
@RestController
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/apiTest",method = RequestMethod.GET)
    public String testTwo(){
        String res = testService.testTwo();
        return res;
    }

}

