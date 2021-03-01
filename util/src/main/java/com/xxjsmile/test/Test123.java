package com.xxjsmile.test;

import com.xxjsmile.bean.Dog;

public class Test123 {

    public static void main(String[] args) {
//        System.out.println(System.getenv("APM_JAVA_AGENT_ENABLE"));
//        System.out.println(System.getProperty("java.class.path"));

        Dog dog = new Dog(13);
        dog.getAge();
    }
}
