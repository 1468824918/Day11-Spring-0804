package com.lanou.sp.test;

import com.lanou.sp.dao.UserDao;
import com.lanou.sp.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/11/6.
 */
@Service("userService")
@DanceTest
public class UserServiceImplTest implements UserService{

    @Resource
    private UserDao userDao;

    public boolean login(String username, String password) {
        return userDao.login(username,password);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
