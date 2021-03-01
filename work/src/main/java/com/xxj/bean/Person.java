package com.xxj.bean;

import java.util.Set;

public class Person {


    private String id;


//    public Person(String id) {
//        this.id = id;
//    }

    public Person() {
    }

    public static String name;




    public void test(Set set){

    }

    public  void test2(int num,Person... people) {
        System.out.println("xxjsmile people2");
        System.out.println(people);
    }

    public  void test3() {
        System.out.println("xxjsmile people3");
    }

    public  void test4(int num,String m) {
        System.out.println(num);
        System.out.println(m);
    }

    public  static void test5(int num,String m) {
        System.out.println(num);
        System.out.println(m);
    }



}


