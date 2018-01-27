package com.dubo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Star {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
        context.start();
        System.in.read();
    }
}
