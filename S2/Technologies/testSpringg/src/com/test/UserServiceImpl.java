package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl implements UserService   {

    // on demande a spring d injecter les instances dans ces deux attributs
    // on va les configurer  dans le fichier applicationContext.xml
    //
   // ClassPathXmlApplicationContext => ce'est un objet permet d'accede a   le object qui sont gere par spring


    @Autowired
    private RoleDao roleDao ;
    @Autowired
    private UserDao userDao;


    public UserServiceImpl() {

        System.out.println(" cree par spring     ");
    }

    public RoleDao getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//


//        UserDao userDao =context.getBean("userDaoImpl",UserServiceImpl.class);
    }
}

