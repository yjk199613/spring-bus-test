/*
 * Copyright (C), 2013-2018, 天津大海云科技有限公司
 */
package com.hiynn.resplatform.admin.poolmanage.service.impl;

import com.hiynn.common.base.ResultInfo;
import com.hiynn.resplatform.admin.poolmanage.dao.TestDao;
import com.hiynn.resplatform.admin.poolmanage.entity.User;
import com.hiynn.resplatform.admin.poolmanage.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * 测试
 *
 * @author kehaiyong
 * @date 2018/7/6 16:07
 * @modified By kehaiyong
 * @since 1.0.0
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestDao testDao;

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public ResultInfo queryUser() {
        List<User> users=testDao.queryUser();

        return ResultInfo.success("查询成功").build(users);
    }
}

