package com.base.thread;

import com.base.thread.lock.SpinLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.LockSupport;

public class TestThread {

    public static void main(String[] args) throws Exception {
        //test1();
        test2();
        //test3();
        //test4()
        //test5();
        //test6();
        test7();
    }

    private static void test7() {
        SpinLock spinLock = new SpinLock();
        new Thread(spinLock::get).start();
    }

    private static void test6() {
        //Lock
        LockSupport.park();
    }

    private static void test5() throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask(myCallable);

        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("执行结束："+futureTask.get());

    }

    private static void test4() {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

    private static void test3() {
        MyThread myThread = new MyThread();
        myThread.start();





    }

    private static void test2() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    System.out.println("中断啦");
                    e.printStackTrace();
                }
            }
        });
        System.out.println("1："+thread.getState());
        thread.start();
        System.out.println("2："+thread.getState());
        //System.out.println(thread.isInterrupted());
        thread.interrupt();
        System.out.println("3："+thread.getState());
        //System.out.println(thread.interrupted());
        //System.out.println(thread.interrupted());
        System.out.println(thread.isInterrupted());
        System.out.println("4："+thread.getState());



        thread.join();
        System.out.println("4："+thread.getState());



    }


    private static void test1() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            System.out.println("child run ");
                        }
                    }
                });
                t2.setDaemon(true);
                t2.start();
                System.out.println("father thread is over");
            }
        });
        t1.start();


    }


}
