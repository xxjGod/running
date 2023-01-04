//package com.xxj.xxjsmile.other.limit;
//
//import com.google.common.util.concurrent.RateLimiter;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * @Description:
// * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
// * @Date 2021/5/17 15:34
// * All Rights Reserved
// */
//public class TestLimit {
//
//
//    public static void main(String[] args) throws Exception {
//        test4();
//        //System.out.println(new SimpleDateFormat("yyyy-mm-dd").parse("2021-05-01").getTime());
//        //System.out.println(new Date().getTime());
//        //test1();
//        //test2();
//        //test3();
//
//
//    }
//
//    private static void test4() {
//
//        System.out.println(19__000==19000);
//    }
//
//    private static void test3() throws InterruptedException {
//        RateLimiter rateLimiter = RateLimiter.create(5, 10000, TimeUnit.MILLISECONDS);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(rateLimiter.acquire());
//        }
//        Thread.sleep(1000L);
//        for (int i = 0; i < 50; i++) {
//            System.out.println(rateLimiter.acquire());
//        }
//
//    }
//
//    private static void test2() {
//        RateLimiter rateLimiter = RateLimiter.create(5) ;
//        System.out.println(rateLimiter.acquire(10));
//        System.out.println(rateLimiter.acquire());
//        System.out.println(rateLimiter.acquire());
//        System.out.println(rateLimiter.acquire());
//        System.out.println(rateLimiter.acquire());
//        System.out.println(rateLimiter.acquire());
//    }
//
//    private static void test1() {
//        RateLimiter rateLimiter = RateLimiter.create(5);
//        System.out.println(rateLimiter.acquire());
//        System.out.println(rateLimiter.acquire());
//        System.out.println(rateLimiter.acquire());
//        System.out.println(rateLimiter.acquire());
//        System.out.println(rateLimiter.acquire());
//        System.out.println(rateLimiter.acquire());
//    }
//
//
//}
