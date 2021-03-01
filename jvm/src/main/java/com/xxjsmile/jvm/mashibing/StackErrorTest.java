package com.xxjsmile.jvm.mashibing;

public class StackErrorTest {

    private static int count;

    public static void main(String[] args) {

        //System.out.println(System.getProperty("java.version"));
        //test1();

        test2();



    }

    //栈溢出StackOverFlowError

    public static void test1(){
        System.out.println("调用次数："+(++count));
        test1();
    }




    //堆溢出OutOfMemoryError

    public static void test2(){
        while (true) {
            System.out.println("线程数："+(++count));
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {

                    }
                }
            });
            thread.start();
        }
    }







}
