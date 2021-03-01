package com.xxj;

public class Test0127 {

    public static void main(String[] args) {
        //test1();
        try {
            int m = 10/0;
        }catch (Exception e){
            System.out.println(e);
        }

    }

    private static void test1() {

        get();
    }

    private static void get() {

        StackTraceElement[] stes = new Throwable().getStackTrace();
        for (StackTraceElement stackTraceElement:
                stes) {
            System.out.println(stackTraceElement);
        }
    }
}
