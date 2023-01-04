package com.xxj.base;

import java.util.Random;


/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/9 5:05 PM
 */

public class TestLocal {


    private static int[][] arrays = new int[10000][10000];
    private static Random random = new Random();


    public static void main(String[] args) {
        for (int i = 0; i < arrays.length - 1; i++) {

            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = random.nextInt(100);

            }

        }

        run1();

        run2();


    }

    private static void run2() {

        long sumStartTime = System.currentTimeMillis();

        Integer sum = 0;

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays[0].length; j++) {
                sum += arrays[j][i];

            }

        }
        long sumEndTime = System.currentTimeMillis();
        System.out.println("2结果：" + sum);
        System.out.println("2花费时间：" + (sumEndTime - sumStartTime));
    }

    private static void run1() {
        long sumStartTime = System.currentTimeMillis();

        Integer sum = 0;

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays[0].length; j++) {
                sum += arrays[i][j];

            }

        }
        long sumEndTime = System.currentTimeMillis();
        System.out.println("1结果：" + sum);
        System.out.println("1花费时间：" + (sumEndTime - sumStartTime));
    }


}
