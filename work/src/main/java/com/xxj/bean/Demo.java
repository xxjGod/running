package com.xxj.bean;

public class Demo {


    static {
        try {
            Class.forName("com.xxj.bean.D");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
