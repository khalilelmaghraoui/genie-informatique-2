package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");



        // retrouver le bean dequis le conteneur

        UserServiceImpl b = context.getBean("userServiceImpl",UserServiceImpl.class);


        

    }
}
