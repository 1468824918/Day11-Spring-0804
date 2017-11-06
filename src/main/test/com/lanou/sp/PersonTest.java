package com.lanou.sp;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/6.
 */
public class PersonTest {

    private ApplicationContext ctx;

    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void test(){
        //加载容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取对象
        Person person = (Person) ctx.getBean("person");
        person.say();
        person.kill();
    }
    @Test
    public void testDI(){
        System.out.println(ctx.getBean("person"));
        System.out.println(ctx.getBean("person2"));
        System.out.println(ctx.getBean("person3"));
    }
}