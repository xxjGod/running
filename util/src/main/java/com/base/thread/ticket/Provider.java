package com.base.thread.ticket;

public class Provider implements Runnable {


    private Object obj;


    public Provider(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                System.out.println("xxj1:"+Thread.currentThread().holdsLock(obj));
                if (Ticket.num > 5) {
                    try {
                        //
                        System.out.println("剩余票数充足，余票：" + Ticket.num);
                        obj.wait();
                        System.out.println("xxj2:"+Thread.currentThread().holdsLock(obj));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    //生产票数
                    Ticket.num += 3;
                    System.out.println("生产3张票，余票：" + Ticket.num);
                    obj.notify();
                }

            }

        }


    }
}
