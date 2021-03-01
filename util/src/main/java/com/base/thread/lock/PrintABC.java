package com.base.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintABC {

    private int state = 0;

    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private Condition conditionC = lock.newCondition();


    public void printA() {
        print(conditionA, conditionB, 0, "A");
    }

    public void printB() {
        print(conditionB, conditionC, 1, "B");
    }

    public void printC() {
        print(conditionC, conditionA, 2, "C");
    }

    private void print(Condition currentCondition, Condition nextCondition, Integer index, String msg) {
        for (int i = 0; i < 3; i++) {
            lock.lock();
            try {
                while (state % 3 != index) {
                    currentCondition.await();
                }
                System.out.println(msg);
                state++;
                nextCondition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }


    }

    public static void main(String[] args) {
        PrintABC printABC = new PrintABC();
        new Thread(() -> {
            printABC.printA();
        }).start();
        new Thread(() -> {
            printABC.printB();
        }).start();
        new Thread(() -> {
            printABC.printC();
        }).start();

    }


}
