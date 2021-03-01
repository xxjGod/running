package com.xxjsmile.jvm.loadclass;

public class SuperClass {

    static {
        System.out.println("SuperClass init");
    }

    public static int value = 123;
    public static final int VALUE = 123;

    public static String father() {
        //System.out.println("father");
        return "father";
    }

}
