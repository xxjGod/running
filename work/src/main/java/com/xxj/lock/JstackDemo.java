package com.xxj.lock;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JstackDemo {

    public static Executor executor = Executors.newFixedThreadPool(5);

    public static Object object = new Object();


    public static void main(String[] args) {
        executor.execute(new Task1());
        executor.execute(new Task1());
    }

    static class Task1 implements Runnable {

        //12120
        @Override
        public void run() {
            synchronized (object) {

                caculate();
            }
        }

        private void caculate() {
            int i = 0;
            while (true) {
                i++;
            }
        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() {
            System.out.println("等待进入拉");
            synchronized (object) {
                try {
                    System.out.println("进入拉");
                    Thread.sleep(2000);
                    //TimeUnit.SECONDS.sleep(1000);
                    object.wait();
                    System.out.println("释放锁辣");
                    //TimeUnit.SECONDS.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
