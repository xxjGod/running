package com.xxj.lock;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/5 3:19 PM
 */

public class TestVolatileAto {

    private volatile int num = 0;


    public void add() {
        num++;
    }

    public static void main(String[] args) {
        TestVolatileAto ato = new TestVolatileAto();


        for (int i=0; i<20; i++) {
            new Thread(() -> {
                for (int j=0; j<1000; j++) {
                    ato.add();
                }
            }).start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println("number值加了2000次，此时number的实际值是：" + ato.num);


    }
}
