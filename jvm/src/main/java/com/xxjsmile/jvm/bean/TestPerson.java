package com.xxjsmile.jvm.bean;

import java.util.concurrent.*;

public class TestPerson {

    public static void main(String[] args) throws ClassNotFoundException {
//        Class<Person> personClass = Person.class;
//        System.out.println(personClass);
        //Class.forName("com.xxjsmile.jvm.bean.Person");
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Callable callable = new Callable() {
            public Object call() throws Exception {

                Thread.sleep(3000);
                return 5;
            }
        };
        Future future = executorService.submit(callable);
        try {
            System.out.println("1");

            System.out.println(future.get());
            System.out.println("2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
