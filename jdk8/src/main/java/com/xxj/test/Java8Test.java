package com.xxj.test;

import java.util.function.Consumer;

public class Java8Test {


    private static Consumer<String> consumer;


    public static void main(String[] args) {
        Person person = new Person();
        person.setName("xxjsmile");
        Test123 test123 = new Test123();
        test123.callRun();
        System.out.println("xx");
        consumer = t -> {
            System.out.println(person);
            System.out.println(t);
        };
        test123.setConsumer(consumer);
        System.out.println("end");
    }


}
