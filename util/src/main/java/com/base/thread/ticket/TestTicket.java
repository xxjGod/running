package com.base.thread.ticket;

public class TestTicket {

    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Provider provider = new Provider(obj);

        Thread p = new Thread(provider);
        p.start();
        //p.join();
        //p.yield();







//        AConsumer aConsumer = new AConsumer(obj);
//
//        new Thread(aConsumer).start();




    }
}
