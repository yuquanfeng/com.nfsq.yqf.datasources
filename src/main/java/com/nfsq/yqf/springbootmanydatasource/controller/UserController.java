package com.nfsq.yqf.springbootmanydatasource.controller;

import com.nfsq.yqf.springbootmanydatasource.persist.test1.entity.User;
import com.nfsq.yqf.springbootmanydatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:15:15
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User getUser(String userName){
        return userService.getUser(userName);
    }
}
