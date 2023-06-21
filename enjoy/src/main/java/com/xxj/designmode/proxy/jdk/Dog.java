package com.xxj.designmode.proxy.jdk;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2023/6/20 6:45 PM
 */

public class Dog implements Animal{
    @Override
    public void name() {
        System.out.println("dog");
    }
}
