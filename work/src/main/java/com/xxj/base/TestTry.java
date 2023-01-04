package com.xxj.base;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/6 11:38 AM
 */

public class TestTry implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("xxj123");
    }


    public static void main(String[] args) {

        try(TestTry testTry = new TestTry()) {

            System.out.println("123");

            int i = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
