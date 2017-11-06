package com.lanou.sp.dao.impl;

import com.lanou.sp.action.UserAction;
import com.lanou.sp.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/6.
 */
public class UserDaoImplTest {

    private ApplicationContext ctx;

    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("annotationContext.xml");
    }
    @Test
    public void test(){
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao.login("111","111"));
    }

    @Test
    public void test2(){
        //测试使用注解进行依赖注入
        UserAction userAction = (UserAction) ctx.getBean("userAction");
        System.out.println(userAction.login());
    }

}