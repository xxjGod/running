package com.xxjsmile.jvm.loadclass;


public class Time {


    public static Long date1 = System.nanoTime();

    public static Long date2 = System.nanoTime();

    public static Long date3;

    static {

        System.out.println("data1:" + date1);
        System.out.println("data2:" + date2);

    }
}
