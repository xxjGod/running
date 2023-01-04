package com.xxj.bean;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/5 2:28 PM
 */

public class BirdA extends BirdB {

    public String name;

    public BirdA(String name) {
        this.name = name;
    }

    public BirdA() {
        System.out.println("BirdA");
    }



    public static void main(String[] args) {
        BirdA birdA = new BirdA();


    }


}
