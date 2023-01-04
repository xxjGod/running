package com.xxj.bean;


/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/5 2:29 PM
 */

public class BirdB {

    public String id;

    protected BirdB() {
        System.out.println("BirdB");
    }

    public BirdB(String id) {

        this.id = id;
    }
}
