package com.xxj.xxjsmile.bean;

import java.util.function.Supplier;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/10 14:55
 * All Rights Reserved
 */
public class Car {

    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(Car car) {
        System.out.println("Collided " + car.toString());

    }


    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}
