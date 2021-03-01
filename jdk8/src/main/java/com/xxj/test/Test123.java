package com.xxj.test;

import java.util.function.Consumer;

public class Test123 {

    private Consumer<String> consumer;


    public void setConsumer(Consumer<String> consumer) {
        this.consumer = consumer;
    }

    public void callRun() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    //消费
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    consumer.accept("xxjsmile");
                    break;

                }
            }
        }).start();

    }


}
