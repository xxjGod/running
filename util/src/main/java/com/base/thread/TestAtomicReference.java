package com.base.thread;

import java.util.concurrent.atomic.AtomicReference;

public class TestAtomicReference {

    private static AtomicReference<Integer> sign =new AtomicReference<>();
    public static void main(String[] args) {

        sign.compareAndSet(null,6);
        System.out.println(sign.get());

        sign.compareAndSet(6,8);
        System.out.println(sign.get());

    }

}
