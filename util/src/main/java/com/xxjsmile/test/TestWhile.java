package com.xxjsmile.test;

public class TestWhile {


    public static void main(String[] args) {
        int i = -1;
        while (i > 0) {

            System.out.println("i:" + i);
            i--;
        }
        do {
            System.out.println("i:" + i);
            i--;
        } while (i > 0);
    }
}
