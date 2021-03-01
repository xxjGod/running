package com.xxjsmile.jvm.mashibing;

/**
 * slot复用
 */
public class SlotReuse {

    public static void main(String[] args) {

        test3();

    }


    public static void test1() {
        byte[] placeholder = new byte[64 * 1024 * 1024];
        System.gc();

    }

    public static void test2() {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        System.gc();
    }

    public static void test3() {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a = 10;
        System.gc();
    }

    public static void test4() {
        byte[] placeholder = new byte[64 * 1024 * 1024];
        int a = 10;
        System.gc();
    }


}
