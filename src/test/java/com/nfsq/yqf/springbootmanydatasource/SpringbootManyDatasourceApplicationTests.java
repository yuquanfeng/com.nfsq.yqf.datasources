package com.nfsq.yqf.springbootmanydatasource;

import com.nfsq.yqf.springbootmanydatasource.persist.test1.entity.User;
import com.nfsq.yqf.springbootmanydatasource.persist.test1.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootManyDatasourceApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
    }
    @Test
    public void testUserMapper(){
        User user = userMapper.selectByUserName("uu");
        System.out.println(user);
    }

}
