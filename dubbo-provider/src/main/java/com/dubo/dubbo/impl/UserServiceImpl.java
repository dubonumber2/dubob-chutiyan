package com.dubo.dubbo.impl;

import com.dubo.dubbo.UserService;

public class UserServiceImpl implements UserService {
    public String sayHello(String name) {
        return "Hello:"+name;
    }
}
