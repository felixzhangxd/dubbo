package com.redstar.dubbo.common.bean;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String psswd;

    public User() {
    }

    public User(String name, String psswd) {
        this.name = name;
        this.psswd = psswd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }
}
