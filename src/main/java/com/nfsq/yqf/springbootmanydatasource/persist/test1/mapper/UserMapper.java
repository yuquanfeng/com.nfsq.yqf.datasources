package com.nfsq.yqf.springbootmanydatasource.persist.test1.mapper;

import com.nfsq.yqf.springbootmanydatasource.persist.test1.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by qfyu
 * Date:2018/12/5
 * Time:14:59
 **/
public interface UserMapper {
//    @Select("select ID id,USER_NAME userName,PASSWORD password\n" +
//            "        from user_t\n" +
//            "        where USER_NAME=#{userName,jdbcType=VARCHAR}")
    User selectByUserName(String userName);
}
