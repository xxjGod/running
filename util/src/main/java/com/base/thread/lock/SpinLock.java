package com.base.thread.lock;

import java.util.concurrent.atomic.AtomicReference;

public class  SpinLock {


    AtomicReference<Thread> reference = new AtomicReference();


    public void lock() {
        Thread thread = Thread.currentThread();
        while (!reference.compareAndSet(null, thread)) {
            //循环
        }


    }

    public void unLock() {
        Thread thread = Thread.currentThread();
        reference.compareAndSet(thread, null);


    }

    public Integer get() {
       return 8;
    }


}
