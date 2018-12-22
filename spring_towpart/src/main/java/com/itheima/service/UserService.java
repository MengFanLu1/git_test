package com.itheima.service;

import com.itheima.dao.UserDao;

public class UserService {


    private UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public void smethod(){

        dao.save();
        System.out.println("业务层!!");

    }
}
