package com.base.thread.ticket;

public class AConsumer implements Runnable {


    private Object obj;

    public AConsumer(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (Ticket.num > 0) {
                    //消费一张票
                    System.out.println("消费一张票，剩余：" + (--Ticket.num));
                } else {
                    //唤醒生产者
                    obj.notify();
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }


    }
}
