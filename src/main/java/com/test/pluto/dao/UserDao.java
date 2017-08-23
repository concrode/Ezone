package com.test.pluto.dao;

import com.test.pluto.entity.User;

/**
 * Created by captain on 2017/5/14.
 */
public interface UserDao {

    public User getUserByName(String name);
}
