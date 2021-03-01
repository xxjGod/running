package com.xxj.lock;

public class TestDeadLock {


    public static void main(String[] args) {


        new Thread(new HelloThread(1)).start();

        new Thread(new HelloThread(2)).start();


    }


}
