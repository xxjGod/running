package com.base.thread;

public class TestThreadLocal {

    static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();


    static ThreadLocal<Integer> threadLocal2 = new ThreadLocal<>();


    public static void main(String[] args) {
        threadLocal.set(18);
        threadLocal2.set(19);

        new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set(18);
                Integer integer = threadLocal.get();
                threadLocal.set(++integer);
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set(18);
                Integer integer = threadLocal.get();
                threadLocal.set(++integer);
            }
        }).start();

        System.out.println(threadLocal.get());

    }
}
