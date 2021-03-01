package com.xxjsmile.demo1;

import java.lang.instrument.Instrumentation;

public class MyAgent {

    //JVM 首先尝试在代理类上调用以下方法
    public static void premain(String agentArgs, Instrumentation inst) {

        System.out.println(ClassLoader.getSystemClassLoader());

        Class[] clas = inst.getAllLoadedClasses();
        for (Class c : clas) {
            System.out.println("classloader:" + c.getClassLoader() + "\tname:" + c.getName());
        }

        System.out.println("xxjsmile agent classloader:" + ClassLoader.getSystemClassLoader());

        Class cla = java.sql.Timestamp.class;
        System.out.println("xxjsmile cla:" + cla);
        System.out.println("xxjsmile java agent version :" + System.getProperty("java.version"));
        System.out.println("嗨！JavaAgent 1.6 " + agentArgs);
    }

    //如果代理类没有实现上面的方法，那么 JVM 将尝试调用该方法
    public static void premain(String agentArgs) {
    }
}
