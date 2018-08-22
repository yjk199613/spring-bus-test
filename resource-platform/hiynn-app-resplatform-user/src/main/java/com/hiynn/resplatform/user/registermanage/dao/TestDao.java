/*
 * Copyright (C), 2013-2018, 天津大海云科技有限公司
 */
package com.hiynn.resplatform.user.registermanage.dao;

import com.hiynn.resplatform.user.registermanage.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 测试
 *
 * @author kehaiyong
 * @date 2018/7/6 16:13
 * @modified By kehaiyong
 * @since 1.0.0
 */
public interface TestDao {

    @Select("select * from u_user")
    List<User> queryUser();
}

