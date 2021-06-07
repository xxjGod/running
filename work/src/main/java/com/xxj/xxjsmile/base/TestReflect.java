package com.xxj.xxjsmile.base;

import com.xxjsmile.bean.C;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/10 14:13
 * All Rights Reserved
 */
public class TestReflect {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Class<?>[] interfaces = C.class.getInterfaces();
        for (Class clz : interfaces){
            System.out.println(clz.getName());
        }

    }

}
