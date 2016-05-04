package com.redstar.dubbo.server.impl;

import com.redstar.dubbo.common.api.IUserService;
import com.redstar.dubbo.common.bean.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService implements IUserService {
    private Map users = new HashMap<String, User>();

    @Override
    public boolean regist(User user) {
        String name = user.getName();
        if(users.containsKey(name)) {
           return false;
        }
        users.put(name, user);
        return true;
    }
}
