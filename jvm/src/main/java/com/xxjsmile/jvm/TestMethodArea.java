package com.xxjsmile.jvm;

public class TestMethodArea extends Object implements Comparable, Cloneable {

    private static String name1 = "xxj1";

    private static final String name2 = "xxj2";


    public String hello1() {
        try {
            int count = 1;
            System.out.println("hello1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "xxj";
    }


    public static void hello2() {
        System.out.println("xxj");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
