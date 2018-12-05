package com.nfsq.yqf.springbootmanydatasource.service;

import com.nfsq.yqf.springbootmanydatasource.persist.test2.entity.Friend;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:15:14
 **/
public interface FriendService {
    Friend getFriend(String friendName);
}
