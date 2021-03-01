package com.xxj.basics;

import sun.misc.Launcher;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class TestUrl {

    public static void main(String[] args) throws ClassNotFoundException {
        //System.out.println(System.getProperty("java.class.path"));

//        Class<?> aClass = Class.forName("com.xxj.bean.Person");
//        System.out.println(aClass);
        URLClassLoader classLoader = (URLClassLoader)TestUrl.class.getClassLoader();
        URL resource = classLoader.getResource("com/xxj/bean");
        System.out.println(resource.getPath());
//        File file = new File(resource.getPath());
//
//        File[] files = file.listFiles();
//        for (File file1:
//        files) {
//            System.out.println(file1.getName());
//        }
//        URL[] urLs = classLoader.getURLs();
//        for (URL url:
//        urLs) {
//            System.out.println(url);
//
//        }

    }
    
}
