package com.xxj.xxjsmile.threadpool;

import java.util.HashMap;
import java.util.Map;
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
        Map<Integer,Future<Integer>> futureMap = new HashMap<>();
        for (int i = 0; i < 2 ; i++) {
            int finalI = i;
            Future<Integer> submit = executorService.submit(() -> {
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("xxj");
                return 3+ finalI;
            });
            futureMap.put(i,submit);
        }
        System.out.println("final");
        futureMap.forEach((k,v)->{
            try {
                System.out.println(v.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        });
        //executorService.shutdown();
        
    }
}
