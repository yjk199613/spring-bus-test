/*
 * Copyright (C), 2013-2018, 天津大海云科技有限公司
 */
package com.hiynn.resplatform.user.registermanage.controller;

import com.hiynn.common.base.ResultInfo;
import com.hiynn.resplatform.user.registermanage.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口测试
 *
 * @author kehaiyong
 * @date 2018/7/6 14:45
 * @modified By kehaiyong
 * @since 1.0.0
 */
@RestController
@RefreshScope
public class TestController {

    @Autowired
    private ITestService testService;

    @Value("${env.name}")
    private String value;

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/userTest", method = RequestMethod.GET)
    public ResultInfo testPlatform(){
        ResultInfo result=testService.queryUser();
        return result;
    }

    @RequestMapping(value = "/userTestConfig", method = RequestMethod.GET)
    public ResultInfo testConfig(){
        return ResultInfo.success("配置文件读取成功").build("配置文件内容值："+value+name);
    }

}

