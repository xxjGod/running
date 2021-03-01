package com.xxj.bean;

import java.util.Properties;

public class Test456 {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //Class<?> x = Class.forName("com.xxj.bean.Demo");
//        Class<?> aClass = ClassLoader.getSystemClassLoader().loadClass("com.xxj.bean.Demo");
//        System.out.println(aClass);
//        Object o = aClass.newInstance();
//        System.out.println(o);
        Properties properties = new Properties();
        System.out.println(properties.getProperty("xxj"));
    }

}
