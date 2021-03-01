package com.xxjsmile.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Test123 {

    static ThreadLocal<Integer> threadLocal = new ThreadLocal();

    static ThreadLocal<Integer> s = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 5;
        }
    };


    public static void main(String[] args) {
        System.out.println("服务端正在输入请等待。。。\r\n");

        System.err.println("来自服务端的消息：123");
        threadLocal.set(14);

        System.out.println(threadLocal.get());
        System.out.println(s.get());
    }
}
