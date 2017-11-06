package com.lanou.sp.service.impl;

import com.lanou.sp.dao.UserDao;
import com.lanou.sp.dao.impl.UserDaoImpl;
import com.lanou.sp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by dllo on 17/11/6.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public boolean login(String username, String password) {
        return userDao.login(username,password);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
