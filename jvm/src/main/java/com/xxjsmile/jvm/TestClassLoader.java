package com.xxjsmile.jvm;

//import sun.net.www.protocol.http.HttpURLConnection;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;


public class TestClassLoader {

    public static void main(String[] args) throws Exception {
       /* ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);*/


        /*ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
        Class clz1 = classLoader1.loadClass("com.xxjsmile.jvm.HelloWorld");

        System.out.println("clz1:"+clz1.hashCode());
        ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
        Class clz2 = classLoader2.loadClass("com.xxjsmile.jvm.HelloWorld");
        System.out.println("clz2:"+clz2.hashCode());

       *//* Class cls = Class.forName("sun.net.www.protocol.http.HttpURLConnection");
        System.out.println(cls);*//*


         *//*ClassLoader classLoader1 = HttpURLConnection.class.getClassLoader();
        System.out.println(classLoader1);*//*

        ClassLoader classLoader3 = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String clazzName = name.substring(name.lastIndexOf(".") + 1) + ".class";

                    InputStream is = getClass().getResourceAsStream(clazzName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Class clz3 =classLoader3.loadClass("com.xxjsmile.jvm.HelloWorld");
        System.out.println(clz1==clz3);*/
        //System.out.println();
        /*Class clz1 = Class.forName("sun.net.www.protocol.http.HttpURLConnection");
        System.out.println(clz1.hashCode());

        ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
        Class clz2 =classLoader1.loadClass("sun.net.www.protocol.http.HttpURLConnection");
        System.out.println(clz2.hashCode());*/
        //Class.forName()  -->使用调用者类加载器

        /*System.out.println(System.getProperty("java.class.path"));
        MyClassLoader classLoader = new MyClassLoader();*/


        //com/xxjsmile/jvm/Person.class
        //Father.class

       /* String name0 = "/Users/xiaoxiangjie/testproject/running/util/src/main/java/com/xxjsmile/bean/Father.class";
        String name1 = "/Users/xiaoxiangjie/testproject/running/util/src/main/java/com/xxjsmile/bean/Father";
        String name2 = "com.xxjsmile.jvm.loadclass.Person";
        Class personClass = classLoader.loadClass(name0);
        Object person = personClass.newInstance();*/
        /*Method method = personClass.getMethod("add");
        method.invoke(person);

        System.out.println("System classloader:"+System.class.getClassLoader());
        System.out.println("Person classloader:"+Person.class.getClassLoader());
        System.out.println("Person2 classloader:"+Person2.class.getClassLoader());*/
        /*Person p = new Person();
        p.add();*/

        System.out.println(TestClassLoader.class.getClassLoader());
        //com.xxjsmile.bean.Father
        ///Users/xiaoxiangjie/IdeaProjects/code-instrument-java/JavaAgent/lib/agent.jar
        // /Users/xiaoxiangjie/testproject/running/util/target/classes/
        File libFile = new File("/Users/xiaoxiangjie/testproject/running/util/target/classes/");
        URLClassLoader loader = (URLClassLoader) TestClassLoader.class.getClassLoader();
        System.out.println(loader);
        URL[] urls = loader.getURLs();
        for (URL url :
                urls) {
            System.out.println("first#######url:" + url.getPath());
        }


        URL targetUrl = libFile.toURL();//jarFile.toURL();

        System.out.println("targetUrl:" + targetUrl);

        boolean isLoader = false;
        for (URL url : loader.getURLs()) {
            if (url.equals(targetUrl)) {
                isLoader = true;
                break;
            }
        }
        // 如果没有加载
        if (!isLoader) {
            Method add = URLClassLoader.class.getDeclaredMethod("addURL", new Class[]{URL.class});
            add.setAccessible(true);
            add.invoke(loader, targetUrl);
        }
//
//
//        for (URL url:
//                urls) {
//            System.out.println("last#######url:"+url.getPath());
//        }
//        //com.cloudwise.agent.main.BaseDirResolver
//        //com.xxjsmile.bean.Father
//        Class<?> mqClass = Class.forName("com.xxjsmile.bean.Father", false, loader);
//        System.out.println(mqClass);
//
//
//        System.out.println("##:"+System.getProperty("java.class.path"));


        //URLClassLoader loader = (URLClassLoader)TestClassLoader.class.getClassLoader();
        System.setProperty("java.class.path", System.getProperty("java.class.path") + ":/Users/xiaoxiangjie/IdeaProjects/code-instrument-java/JavaAgent/lib/agent.jar");

        System.out.println(System.getProperty("java.class.path"));
        Class claz = Class.forName("com.cloudwise.agent.main.BaseDirResolver", false, loader);
    }

}

