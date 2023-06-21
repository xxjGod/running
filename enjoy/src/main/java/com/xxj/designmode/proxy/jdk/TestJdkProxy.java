package com.xxj.designmode.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @Description: jdk动态代理 反射
 * @Author: xiaoxiangjie
 * @CreateTime: 2023/6/20 6:49 PM
 */

public class TestJdkProxy {

    public static void main(String[] args) {

        Dog dog = new Dog();
        DynamicProxyHandler proxyHandler = new DynamicProxyHandler(dog);
        Animal proxy = (Animal) Proxy.newProxyInstance(dog.getClass().getClassLoader(), dog.getClass().getInterfaces(), proxyHandler);
        proxy.name();


    }
}
