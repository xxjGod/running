package com.xxj.xxjsmile.proxy;

import com.xxjsmile.bean.Animal;
import com.xxjsmile.bean.Bird;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/7 17:21
 * All Rights Reserved
 */
public class TestJDKProxy {


    public static void main(String[] args) {
        Animal animal = new Bird("黄鹂");
        Animal obj = (Animal) Proxy.newProxyInstance(animal.getClass().getClassLoader(), animal.getClass().getInterfaces(), (p, m, arg) -> {
            if(m.getName().equals("eat")){
                System.out.println("执行之前");
                Object invoke = m.invoke(animal, args);
                System.out.println("执行之后");
                return invoke;
            }else {
                return m.invoke(animal, args);
            }
        });


        obj.eat();
        obj.sleep();
    }
}
