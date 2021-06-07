package com.xxj.xxjsmile.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/7 20:43
 * All Rights Reserved
 */
public class TestThreadPool {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 2 ; i++) {
            Future<?> submit = executorService.submit(() -> {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("xxj");
                return 3;
            });
            //Object o = submit.get();
            //System.out.println();
        }
        System.out.println("final");
        
        
    }
}
