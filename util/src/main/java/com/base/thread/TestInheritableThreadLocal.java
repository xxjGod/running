package com.base.thread;

public class TestInheritableThreadLocal {

    public static ThreadLocal<Integer> threadLocal = new InheritableThreadLocal<Integer>();


    public static void main(String[] args) {

        threadLocal.set(19);
        System.out.println(threadLocal.get());

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(threadLocal.get());
            }
        }).start();

    }

}
