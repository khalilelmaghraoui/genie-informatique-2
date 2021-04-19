package com.test;

import org.springframework.stereotype.Component;

@Component
public class RoleDaoImpl implements RoleDao {

    public RoleDaoImpl() {
        System.out.println("role dao impl created ");
    }
}
