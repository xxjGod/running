package com.xxj.xxjsmile.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/7 10:23
 * All Rights Reserved
 */
public class TestCountDawnLatch {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);

        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        System.out.println("111");
        countDownLatch.await();
        System.out.println("complete");
    }
}
