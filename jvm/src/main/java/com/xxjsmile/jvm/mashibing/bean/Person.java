package com.xxjsmile.jvm.mashibing.bean;

public class Person {

    private static int num;

    static
    {
        System.out.println("init Person");
    }

    public static void main(String[] args) {
        System.out.println("123");
    }

    public static void test1() {
        System.out.println("test1");
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Person.num = num;
    }
}
