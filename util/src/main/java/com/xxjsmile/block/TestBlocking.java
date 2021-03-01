package com.xxjsmile.block;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestBlocking {


    public static void main(String[] args) {
        final BlockingQueue queue = new LinkedBlockingQueue<String>(10000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("准备取啦");
                    try {
                        System.out.println("取到啦：" + queue.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "消费者").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                int num = 0;
                while (true) {
                    System.out.println("准备放啦");
                    try {
                        String msg = "xxj" + (++num);
                        System.out.println("放到啦：" + msg);
                        queue.put(msg);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }, "生产者").start();
    }


}
