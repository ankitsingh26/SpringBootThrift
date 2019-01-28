package com.oyo.demo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RPCThriftServerApp {
    private static RPCThriftServer rpcThriftServer;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RPCThriftServerApp.class,args);
        try {
            rpcThriftServer = context.getBean(RPCThriftServer.class);
            rpcThriftServer.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
