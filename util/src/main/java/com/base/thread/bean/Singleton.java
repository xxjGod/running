package com.base.thread.bean;


public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {
    }


    public Singleton getSingleton() {
        if (singleton == null) {

            synchronized (Singleton.class) {
                if (singleton == null) {

                    //指令重排
                    singleton = new Singleton();
                }


            }

        }
        return singleton;


    }


}
