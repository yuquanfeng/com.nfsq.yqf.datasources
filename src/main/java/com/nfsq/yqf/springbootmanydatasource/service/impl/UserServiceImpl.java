package com.nfsq.yqf.springbootmanydatasource.service.impl;

import com.nfsq.yqf.springbootmanydatasource.persist.test1.entity.User;
import com.nfsq.yqf.springbootmanydatasource.persist.test1.mapper.UserMapper;
import com.nfsq.yqf.springbootmanydatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:15:12
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(String userName) {
        return userMapper.selectByUserName(userName);
    }
}
