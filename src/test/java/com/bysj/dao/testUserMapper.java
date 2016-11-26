package com.bysj.dao;

import com.bysj.YdApplication;
import com.bysj.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


////@SpringBootTest(classes = YdApplication.class)
//@RunWith(SpringRunner.class)
//@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = YdApplication.class)
@WebAppConfiguration
public class testUserMapper {
   private final static Logger logger= LoggerFactory.getLogger(testUserMapper.class);
    @Autowired
    UserMapper userMapper;

    @Test
    public void  findUserByName(){
       User user= userMapper.findUsersByName("wuyadong");
        logger.info(user.toString());
    }

}
