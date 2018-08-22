/*
 * Copyright (C), 2013-2018, 天津大海云科技有限公司
 */
package com.hiynn.usercenter.controller;

import com.hiynn.common.base.ResultInfo;
import com.hiynn.usercenter.service.ITestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 测试
 *
 * @author kehaiyong
 * @date 2018/7/13 10:27
 * @modified By kehaiyong
 * @since 1.0.0
 */
@RestController
public class TestController {

    @Autowired
    private ITestService testService;
    @Autowired
    RestTemplate restTemplate;
    @Value("${jdbc.driverClassName}")
    private String value;

    @RequestMapping(value = "/userCenterTest1",method = RequestMethod.GET)
    public ResultInfo testOne(){
        String res = testService.testOne();
        return ResultInfo.success("查询成功").build(res);
    }


    /**
     *
     * @author kehaiyong
     * @param
     * @return 消费资源平台服务相关业务接口
     * @modified By
     * @throws
     */
    @RequestMapping(value = "/userCenterTest2",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod="errorMessage")
    public ResultInfo consumeResPlatform(){
        ResultInfo res = restTemplate.getForObject("http://app-resplatform-admin/adminTest", ResultInfo.class);
        return res;
    }

    public ResultInfo errorMessage(){
        return  ResultInfo.failure("服务出现故障");
    }


    @RequestMapping(value = "/userCenterTestConfig",method = RequestMethod.GET)
    public ResultInfo testOneConfig(){
        return ResultInfo.success("配置文件查询成功").build("配置文件读取："+value);
    }
}

