package com.lanou.sp.action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dllo on 17/11/6.
 */
public class UserActionTest {

    @Test
    public void loginTest(){
        //加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("userContext.xml");

        //获取Action对象
        UserAction userAction = (UserAction) ctx.getBean("userAction");
        System.out.println(userAction.login());
    }

}