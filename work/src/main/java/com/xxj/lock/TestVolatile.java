package com.xxj.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/5 2:51 PM
 */

public class TestVolatile {

    private volatile int num = 0;

    public void add10() {
        num += 10;
    }

    public static void main(String[] args) {
        TestVolatile myData = new TestVolatile();
        new Thread(() -> {
            System.out.println("线程" + Thread.currentThread().getName() + "\t 正在执行");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            myData.add10();
            System.out.println("线程" + Thread.currentThread().getName() + "\t 更新后，number的值为" + myData.num);


        }).start();

        while (myData.num == 0) {
            System.out.println("123");
        }
        System.out.println("具有可见性！");


    }


}
