package com.nfsq.yqf.springbootmanydatasource.service.impl;

import com.nfsq.yqf.springbootmanydatasource.persist.test2.entity.Friend;
import com.nfsq.yqf.springbootmanydatasource.persist.test2.mapper.FriendMapper;
import com.nfsq.yqf.springbootmanydatasource.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:15:14
 **/
@Service
public class FriendServiceImpl implements FriendService {

    @Autowired
    FriendMapper friendMapper;

    @Override
    public Friend getFriend(String friendName) {
        return friendMapper.selectByFriendName(friendName);
    }
}
