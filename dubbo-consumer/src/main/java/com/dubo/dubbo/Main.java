package com.dubo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
        UserService userService=(UserService) context.getBean("userService");
        String a=userService.sayHello("杜波大傻逼");
        System.out.println(a);
    }
}
