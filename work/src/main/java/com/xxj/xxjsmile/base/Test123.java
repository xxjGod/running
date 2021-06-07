package com.xxj.xxjsmile.base;

import java.util.Calendar;
import java.util.Date;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/12 12:32
 * All Rights Reserved
 */
public class Test123 {

    public static void main(String[] args) {
        //Integer m = new Integer(127);
        //Integer.valueOf()
        //Integer n = new Integer(127);
        /*Integer m = 128;
        Integer n = 128;
        System.out.println(m==n);*/
        //test1();
        test2();
    }

    private static void test2() {

        int num = 20/200;
        System.out.println(num);
    }

    private static void test1() {

        Calendar calendar = Calendar.getInstance();
        Date endTime = calendar.getTime();

        System.out.println(endTime);
        calendar.add(Calendar.DATE, -15);
        System.out.println(calendar.getTime());
    }
}
