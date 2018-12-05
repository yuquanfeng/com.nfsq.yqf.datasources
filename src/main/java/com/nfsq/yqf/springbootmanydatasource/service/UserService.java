package com.nfsq.yqf.springbootmanydatasource.service;

import com.nfsq.yqf.springbootmanydatasource.persist.test1.entity.User;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:15:11
 **/
public interface UserService {
    User getUser(String userName);
}
