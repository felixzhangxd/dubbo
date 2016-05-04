package com.redstar.dubbo.server;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {
    public static void main(String[] args) {
//        Main.main(args);
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        context.start();
        synchronized (Server.class) {
            while (true) {
                try {
                    Server.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
