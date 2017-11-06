package com.lanou.sp.action;

import com.lanou.sp.service.UserService;
import com.lanou.sp.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/11/6.
 */
@Controller()
@Scope("prototype")
public class UserAction {
//    @Autowired
//    @Qualifier("userService")
    @Resource(name = "userService")
    private UserService userService;

    public String login(){

        if (userService.login("111","111")){
            return "success";
        }else return "error";
    }

    //Required注解,给成员变量的set方法使用
    //作用:加了注解以后,那么对应的属性必须在配置文件(xml文件)中对其赋值
//    @Required
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
