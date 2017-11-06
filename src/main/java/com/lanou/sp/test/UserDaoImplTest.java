package com.lanou.sp.test;

import com.lanou.sp.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by dllo on 17/11/6.
 */
@Repository("userDao")
@DanceTest
public class UserDaoImplTest implements UserDao{
    public boolean login(String username, String password) {
        return true;
    }
}
