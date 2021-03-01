package com.xxjsmile.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class TestXxj {

    public static void main(String[] args) {

        //java.sql.Timestamp
        /*String str = System.getProperty("java.class.path");
        System.out.println(str);
        System.out.println(Person.class.getClassLoader());*/
        // java.sql.Timestamp

        /*Class targetclass = Timestamp.class;
        String className = targetclass.getName();
        className = className.replace('.', '/');
        String resource = "/" + className + ".class";
        URL url = targetclass.getResource(resource);
        System.out.println(url.getFile());*/
        /*String claa = Timestamp.class.getName();
        System.out.println(claa);*/

        ClassLoader classLoader3 = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {

                    System.out.println("@@:" + Timestamp.class.getClassLoader());
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

        try {
            Class clz = classLoader3.loadClass("java.sql.Timestamp");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(ClassLoader.getSystemClassLoader());
        Map map = new HashMap();
        map.put(java.sql.Timestamp.class, "123");

    }
}
