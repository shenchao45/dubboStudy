package com.shenchao.dubbo.service.impl;

import com.shenchao.dubbo.pojo.User;
import com.shenchao.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shenchao on 2017/2/22.
 */
public class UserServiceImpl implements UserService {
    /**
     * 实现查询，这里做模拟实现，不做具体的数据库查询
     */
    public List<User> queryAll() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(10 + i);
            user.setId(Long.valueOf(i + 1));
            user.setPassword("123456");
            user.setUsername("username_" + i);
            list.add(user);
        }
        return list;
    }
}

