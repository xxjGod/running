package com.xxj.xxjsmile.base.init;

import java.lang.reflect.Field;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/12/13 5:20 PM
 */

public class TestA {

    private static TestB testB;
    static {
        System.out.println("TestA");
    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //TestB testB = TestA.testB;
//        Class<TestB> testBClass = TestB.class;
//        testBClass.
        //TestB.run();
        //int n = TestB.n;
        //Class.forName("com.xxj.xxjsmile.base.init.TestB");
        //int n = TestB.m;
        Class<TestB> testBClass = TestB.class;
        Field n = testBClass.getDeclaredField("n");
        n.getName();

    }
}
