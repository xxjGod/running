package com.xxj.xxjsmile.bean;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/7 17:18
 * All Rights Reserved
 */
public class Bird implements Animal {


    private String name;


    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + "吃虫子");
    }

    @Override
    public void sleep() {
        System.out.println(name + "睡觉");
    }


    public  int withFriend() {
        //System.out.println("和" + bird.getName() + "是好朋友");
        return 2;
    }

    public int withFriendPlus(Bird bird) {
        System.out.println("和" + bird.getName() + "是好朋友");
        return 2;
    }

    public String getName() {
        return name;
    }

    public static void test(Bird bird) {

        //System.out.println(123);
    }

    public void test2() {

        System.out.println(123);
    }

    public void setName(String name) {
        this.name = name;
    }
}


