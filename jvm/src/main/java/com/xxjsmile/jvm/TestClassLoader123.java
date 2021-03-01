package com.xxjsmile.jvm;

public class TestClassLoader123 {

    public static void main(String[] args) throws Exception {
        /*// 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        // 获取系统类加载器的父类加载器 --> 扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        // 获取扩展类加载器的父类加载器 --> 根加载器（C/C++）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        // 测试当前类的加载器
        ClassLoader classLoader = Class.forName("com.xxjsmile.jvm.loadclass.Person").getClassLoader();
        System.out.println(classLoader);
        // 测试JDK内置的类加载器
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);
        // 如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));*/
        //Class c = java.sql.Timestamp.class;
        Class cla = java.sql.Timestamp.class;
        Class.forName("java.sql.Timestamp");

    }
}
