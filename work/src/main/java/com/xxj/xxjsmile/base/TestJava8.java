package com.xxj.xxjsmile.base;

import java.util.function.Consumer;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/10 17:24
 * All Rights Reserved
 */

public class TestJava8 {

    int m = 0;

    public int a(int a, int n) {
        m++;
        return 6;
    }

    public static void main(String[] args) {
        test1();
    }

    /**
     * 类实例方法  接口入参参数比Test1的a方法多一个，且Test1::a的Test1与该入参类型Test1相同
     */
    private static void test1() {
        TestJava8 testJava8 = new TestJava8();
        MyInter<TestJava8> m = TestJava8::a;
        m.d(testJava8,2,5);
        System.out.println(testJava8.m);

    }
}

@FunctionalInterface
interface MyInter<T> {

    public void d(T c, int n, int b);

}
