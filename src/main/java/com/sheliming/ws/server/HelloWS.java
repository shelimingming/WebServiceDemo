package com.sheliming.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface HelloWS {
    @WebMethod
    String hello(String name);

    @WebMethod
    List<User> getUsers();
}
