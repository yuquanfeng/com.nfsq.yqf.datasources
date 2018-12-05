package com.nfsq.yqf.springbootmanydatasource.controller;

import com.nfsq.yqf.springbootmanydatasource.persist.test2.entity.Friend;
import com.nfsq.yqf.springbootmanydatasource.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:15:17
 **/
@RestController
@RequestMapping("/friend")
public class FriendController {
    @Autowired
    FriendService friendService;

    @RequestMapping(value = "/getFriend",method = RequestMethod.GET)
    public Friend getFriend(String friendName){
        return friendService.getFriend(friendName);
    }
}
