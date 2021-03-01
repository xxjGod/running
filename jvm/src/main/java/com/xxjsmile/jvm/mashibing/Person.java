package com.xxjsmile.jvm.mashibing;

public class Person {


    @Override
    protected void finalize() throws Throwable {
        System.out.println("xxjsmile");
    }
}
