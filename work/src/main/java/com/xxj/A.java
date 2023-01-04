package com.xxj;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/11/30 4:00 PM
 */

public class A {


    protected void test1(Integer o){}


    public static class B extends A{
        @Override
        public void test1(Integer o) {
            super.test1(o);
        }
    }
}


