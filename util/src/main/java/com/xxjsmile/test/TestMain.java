package com.xxjsmile.test;


//import sun.net.www.protocol.http.HttpURLConnection;

import com.xxjsmile.bean.Father;

import java.io.IOException;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;

public class TestMain {

    public static void main(String[] args) throws Throwable {
        /*System.out.println(System.getProperty("java.class.path"));
        RuntimeMXBean mxbean = ManagementFactory.getRuntimeMXBean();
        System.out.println(mxbean.getClassPath());
        System.out.println(Integer.class.getName());*/
        /*Package p = TestMain.class.getPackage();
        System.out.println(p);
        System.out.println(TestMain.class.getClassLoader());
        TestMain.class.*/
        //sun.net.www.protocol.http.HttpURLConnection
        //Class targetclass = HttpURLConnection.class;

        /*System.out.println(HttpURLConnection.class.getClassLoader());
        System.out.println(HttpURLConnection.class);
        String className = targetclass.getName();

        className = className.replace('.', '/');
        String resource = "/" + className + ".class";
        URL url = targetclass.getResource(resource);
        System.out.println("url.getPath():"+url.getPath());*/
//        InputStream inputStream=  ClassLoader.getSystemResourceAsStream(url.getFile().get);
//        System.out.println("inputStream = " + inputStream);
//        System.out.println(inputStream.read());
        /*System.out.println(url.getFile());
        System.out.println(url.getPath());*/
//        InputStream inputStream=targetclass.getResourceAsStream("/sun/net/www/protocol/http/HttpURLConnection.class");
//        System.out.println("inputStream = " + inputStream);
//
//        byte[] bs=new byte[inputStream.available()];
//        System.out.println(inputStream.read(bs));
//        System.out.println(new String(bs));
        //System.out.println("xxj1:"+inputStream.available());
        //System.out.println("xxj2:"+bs.length);
        //System.out.println(url.getFile().getBytes().length);
       /* InputStream is = URLClassLoader.class.getResourceAsStream(url.getFile());
        System.out.println("xxjsmile is:"+is);
        byte[] buf = new byte[65536];
        try {
            int len = is.read(buf);
            System.out.println(len);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       /* Father father = new Father();
        Method method = Father.class.getDeclaredMethod("set");
        //功能是启用或禁用安全检查
        method.setAccessible(true);
        method.invoke(father);*/
        System.out.println(TestMain.class.getClassLoader().getClass());


    }
}
