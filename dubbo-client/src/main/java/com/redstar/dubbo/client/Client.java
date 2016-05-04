package com.redstar.dubbo.client;

import com.redstar.dubbo.common.api.IUserService;
import com.redstar.dubbo.common.bean.User;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IUserService userService = (IUserService) ctx.getBean("userService");
        boolean isSuccess = userService.regist(new User("felix", "passwd"));
        System.out.println("regist: " + isSuccess);
        isSuccess = userService.regist(new User("felix", "passwd"));
        System.out.println("regist: " + isSuccess);
        ctx.close();
    }
}
