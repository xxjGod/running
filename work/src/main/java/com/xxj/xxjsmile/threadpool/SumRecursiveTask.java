package com.xxj.xxjsmile.threadpool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/12/13 4:42 PM
 */

public class SumRecursiveTask extends RecursiveTask<Long> {

    //大于3000要拆分(创建一个变量)
    //是否要拆分的临界值
    private static final int THRESHOLD = 3000;

    //起始值
    private final int start;
    //结束值
    private final int end;

    //构造方法(传递起始值、结束值)
    public SumRecursiveTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    //任务编写完成
    @Override
    protected Long compute() {
        int length = end - start;
        //计算
        if (length < THRESHOLD) {
            long sum = 0;
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            //拆分
            int middle = (start + end) / 2;
            SumRecursiveTask left = new SumRecursiveTask(start, middle);
            left.fork();

            SumRecursiveTask right = new SumRecursiveTask(middle + 1, end);
            right.fork();
            return left.join() + right.join();
        }
    }

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        //放入线程池
        ForkJoinPool pool = new ForkJoinPool();
        SumRecursiveTask task = new SumRecursiveTask(1, 59999);
        Long result = pool.invoke(task);
        System.out.println("result="+result);
        Long end = System.currentTimeMillis();
        System.out.println("消耗时间:"+(end-start));
//        Long start = 1L;
//        Long end = 59999999999L;
//        long middle = (start + end) / 2;
//        System.out.println(middle);
    }

}
