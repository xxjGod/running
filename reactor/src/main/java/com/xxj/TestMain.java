package com.xxj;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TestMain {


    public static void main(String[] args) {

        Callable callable = () -> {

            Thread.sleep(3000);
            return 10;

        };

        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println("end");

    }
}
