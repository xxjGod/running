package com.base.thread.lock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLock {


    Lock lock = new ReentrantLock();

    public synchronized void lock() {

        System.out.println("当前线程：" + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void reentrantLock() {
        System.out.println("当前线程：" + Thread.currentThread().getName());

//        try {
//            System.out.println("当前线程：" + Thread.currentThread().getName()+lock.tryLock(10, TimeUnit.SECONDS));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            System.out.println("当前线程：" + Thread.currentThread().getName()+lock.tryLock(10, TimeUnit.SECONDS));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程：" + Thread.currentThread().getName()+"工作");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }


    /**
     * synchronized
     */
    private static void test1() {

        TestReentrantLock lock = new TestReentrantLock();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
            }
        }, "threadA");
        threadA.start();


        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
            }
        }, "threadB");
        threadB.start();
        threadB.interrupt();
    }


    private static void test2() {

        TestReentrantLock lock = new TestReentrantLock();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.reentrantLock();
            }
        }, "threadA");
        threadA.start();


        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.reentrantLock();
            }
        }, "threadB");
        threadB.start();
        threadB.interrupt();
    }

    public static void main(String[] args) {
        //test1();
        test2();
        //test3();

    }

    private static void test3() {
        Lock lock1 = new ReentrantLock();
        lock1.unlock();
    }


}
