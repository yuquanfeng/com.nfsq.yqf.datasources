package com.nfsq.yqf.springbootmanydatasource.persist.test2.mapper;

import com.nfsq.yqf.springbootmanydatasource.persist.test2.entity.Friend;
import org.apache.ibatis.annotations.Select;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:15:01
 **/
public interface FriendMapper {
//    @Select("select ID id,FRIEND_NAME friendName,PASSWORD password\n" +
//            "        from friend_t\n" +
//            "        where FRIEND_NAME=#{friendName,jdbcType=VARCHAR}")
    Friend selectByFriendName(String FriendName);
}
