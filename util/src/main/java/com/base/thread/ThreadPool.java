package com.base.thread;

import java.util.concurrent.*;

public class ThreadPool {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //test1();
        test2();

        //test3();
    }

    private static void test3() {

        //容量为1的缓冲池
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        ExecutorService executorService2 = Executors.newFixedThreadPool(2);
        ExecutorService executorService3 = Executors.newCachedThreadPool();

    }

    private static void test2() throws ExecutionException, InterruptedException {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5),Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());


        for (int i = 0; i < 2; i++) {
            MyTask myTask = new MyTask(i);
            Future<?> submit = executor.submit(myTask);
            System.out.println(submit.get());
        }


//        for (int i = 0; i < 19; i++) {
//            MyTask myTask = new MyTask(i);
//            executor.execute(myTask);
//            System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" +
//                    executor.getQueue().size() + "，已执行玩别的任务数目：" + executor.getCompletedTaskCount());
//        }
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    if (executor.getQueue().size() > 0) {
//                        System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" +
//                                executor.getQueue().size() + "，已执行玩别的任务数目：" + executor.getCompletedTaskCount());
//                    } else {
//                        if (executor.getCompletedTaskCount() == 11) {
//                            break;
//                        }
//
//
//                    }
//                }
//
//            }
//        }).start();
        executor.shutdown();

    }

    private static void test1() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("xxj");
            }
        });
        thread.start();
        ThreadPoolExecutor threadPoolExecutor = null;

    }
}
