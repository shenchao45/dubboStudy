package com.shenchao.dubbo.service;


import com.shenchao.dubbo.pojo.User;

import java.util.List;

/**
 * Created by shenchao on 2017/2/22.
 */


public interface UserService {

    /**
     * 查询所有的用户数据
     *
     * @return
     */
    public List<User> queryAll();

}
