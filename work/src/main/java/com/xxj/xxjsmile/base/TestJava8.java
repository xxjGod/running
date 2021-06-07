package com.xxj.xxjsmile.base;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/10 17:24
 * All Rights Reserved
 */

public class TestJava8 {


    public void a(int a, int n, int b) {
    }

    public static void main(String[] args) {
        test1();
    }

    /**
     * 类实例方法  接口入参参数比Test1的a方法多一个，且Test1::a的Test1与该入参类型Test1相同
     */
    private static void test1() {
        MyInter m = TestJava8::a;
    }
}

@FunctionalInterface
interface MyInter {

    public void d(TestJava8 f, int n, int b, int a);

}
