package com.base.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(this);
        System.out.println(this==Thread.currentThread());
//        Thread.sleep(30000);
//        while(true){
//
//            System.out.println("");
//
//        }

    }
}
