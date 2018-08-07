package com.sheliming.ws.server;

import javax.xml.ws.Endpoint;

public class WSServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/hello", new HelloWSImpl());
        System.out.println("ws 发布成功");
    }
}
