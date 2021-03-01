package com.xxjsmile.util;


import com.xxjsmile.jvm.loadclass.MyClassLoader;

import java.io.File;
import java.io.FilenameFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test123 {

    public static void main(String[] args) {

        MyClassLoader myClassLoader = new MyClassLoader("");
        try {
            //classpath
            //com/xxjsmile/bean/book/Book
            Class clazz = myClassLoader.loadClass("com.xxjsmile.bean.book.Book");
            System.out.println(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String path = "/Users/xiaoxiangjie/project/IdeaProjects/code-instrument-java/JavaAgent/plugins";

        System.out.println(Thread.currentThread().getContextClassLoader());

        System.out.println(ClassLoader.getSystemClassLoader());
        URLClassLoader urlClassLoader = URLClassLoader.newInstance(resolvePlugins(path), ClassLoader.getSystemClassLoader());
        try {
            Class clazz = urlClassLoader.loadClass("com.cloudwise.agent.plugin.tomcat.TomcatPlugin");
            System.out.println(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static URL[] resolvePlugins(String path) {
        // TODO Auto-generated method stub
        final File file = new File(path);

        if (!file.exists()) {
            return new URL[0];
        }

        if (!file.isDirectory()) {
            return new URL[0];
        }


        final File[] jars = file.listFiles(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                return name.endsWith(".jar");
            }
        });

        if (file == null || file.length() == 0) {
            return new URL[0];
        }

        final URL[] urls = new URL[jars.length];


        for (int i = 0; i < jars.length; i++) {
            try {
                urls[i] = jars[i].toURI().toURL();
            } catch (MalformedURLException e) {
                // TODO have to change to PinpointException AFTER moving the exception to pinpoint-common
                throw new RuntimeException("Fail to load plugin jars", e);
            }
        }

        for (File pluginJar : jars) {
            //log.info("Found plugins: " + pluginJar.getPath());
            System.out.println(pluginJar.getPath());
        }

        return urls;
    }
}
