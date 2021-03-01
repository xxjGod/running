package com.base.thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(this);
    }
}
