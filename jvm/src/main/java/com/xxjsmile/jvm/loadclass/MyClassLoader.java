package com.xxjsmile.jvm.loadclass;

import java.io.*;

public class MyClassLoader extends ClassLoader {

    private String rootPath;


    public MyClassLoader(String rootPath) {
        this.rootPath = rootPath;
    }

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] date = getDate(name);
            return defineClass(name,date,0,date.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //返回类的字节码
    private byte[] getDate(String name) throws IOException {

        String path = rootPath + name.replace('.', File.separatorChar) + ".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream(path);
            out = new ByteArrayOutputStream();
            byte[] buffer = new byte[2048];
            int len = 0;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            return out.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            in.close();
            out.close();
        }
        return null;
    }

    public static void main(String[] args) throws Exception{
        ///Users/xiaoxiangjie/project/testproject/running/jvm/src/main/java/
        ///Users/xiaoxiangjie/project/testproject/xxjsmile/bootdemo/src/main/java/
        MyClassLoader classLoader1 = new MyClassLoader("/Users/xiaoxiangjie/project/testproject/running/jvm/src/main/java/");
        try {
            //Thread.currentThread().setContextClassLoader(classLoader1);
            //com.xxjsmile.jvm.loadclass.Person
            //com.xxjsmile.bootdemo.util.Time
            String name = "com.xxjsmile.jvm.loadclass.Person";
            ///Users/xiaoxiangjie/project/testproject/running/jvm/src/main/java/com/xxjsmile/jvm
//            Class clz1 = classLoader1.findClass(name);
//
//            Class clz2 = classLoader1.findClass(name);
            //System.out.println(Person.class.getName());
          //ClassLoader.getSystemClassLoader().loadClass(name);
           //ClassLoader.getSystemClassLoader().loadClass(name);
//            System.out.println(clz1);
           System.out.println(classLoader1.findClass(name));

            System.out.println(classLoader1.findClass(name));
            //Class clz2 = classLoader1.findClass(name);
            //Class<?> aClass = Thread.currentThread().getContextClassLoader().loadClass("com.xxjsmile.jvm.loadclass.Person");


            //Class<?> aClass2 = Thread.currentThread().getContextClassLoader().loadClass("com.xxjsmile.jvm.loadclass.Person");

            //System.out.println(aClass.equals(clz1));


//            System.out.println("0.1"+Class.forName("com.xxjsmile.jvm.loadclass.Person").getClassLoader());
//            //Class clz2 = classLoader1.findClass(name);
//
//            System.out.println("---"+ new Person().getClass().getClassLoader());
//
//
//            System.out.println("1:"+clz1.getClassLoader());
//            System.out.println("2:"+MyClassLoader.class.getClassLoader());
//
//            System.out.println("2.5:"+Person.class.getClassLoader());
//            Person person = new Person();
//            System.out.println("3:"+person.getClass().getClassLoader());
//            System.out.println("###############");
//            person.add();

//            MyClassLoader classLoader2 = new MyClassLoader("/Users/xiaoxiangjie/project/testproject/running/jvm/src/main/java/");
//
//            Class clz2 = classLoader2.findClass(name);
//            System.out.println(clz2);
//            System.out.println(clz1.equals(clz2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
