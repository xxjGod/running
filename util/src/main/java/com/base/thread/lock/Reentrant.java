package com.base.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {


    Lock lock = new ReentrantLock();


    public void outer() throws InterruptedException {
        lock.lock();
        inner();
        lock.unlock();


    }

    private void inner() throws InterruptedException {
        lock.lock();
        System.out.println("当前线程：" + Thread.currentThread().getName());
        Thread.sleep(30000);
        lock.unlock();

    }

    public static void main(String[] args) throws InterruptedException {
        Reentrant unReentrant = new Reentrant();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    unReentrant.outer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "threadA");
        threadA.start();

        Thread.sleep(1000);

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("b1");
                    unReentrant.inner();
                    System.out.println("b2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "threadB");
        threadB.start();


        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("c1");
                    unReentrant.outer();
                    System.out.println("c2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "threadC");
        threadC.start();


    }

}
