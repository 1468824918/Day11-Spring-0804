package com.lanou.sp.dao.impl;

import com.lanou.sp.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by dllo on 17/11/6.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    public boolean login(String username, String password) {
        if ("111".equals(username) && "111".equals(password)) {
            return true;
        }
        return false;
    }
}
