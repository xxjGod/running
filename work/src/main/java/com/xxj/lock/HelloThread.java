package com.xxj.lock;

public class HelloThread implements Runnable {

    private static Person object1 = new Person();

    private static Person object2 = new Person();

    public int state;


    public HelloThread(int state) {
        this.state = state;
    }

    @Override
    public void run() {

        if (state == 1) {
            synchronized (this.object1) {
                System.out.println("进入object1");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this.object2) {


                }


            }


        } else {
            synchronized (this.object2) {
                System.out.println("进入object2");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this.object1) {


                }


            }


        }


    }
}
