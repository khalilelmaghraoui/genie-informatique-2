package com.test;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {


    public UserDaoImpl() {
        System.out.println("UserDaoImpl has been created");
    }
}
