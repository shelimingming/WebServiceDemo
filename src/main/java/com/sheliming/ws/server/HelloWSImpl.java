package com.sheliming.ws.server;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class HelloWSImpl implements HelloWS {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "sheliming", new Date()));
        users.add(new User(2, "huangxiao", new Date()));
        return users;
    }
}
