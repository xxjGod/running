package com.xxjsmile.test;


import java.io.InputStream;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestXxj {

    public static void main(String[] args) throws Exception {
        /*List list = new ArrayList();
        List l = Arrays.asList(new String[0]);
        list.addAll(Arrays.asList(new String[0]));
        list.add("xxj");
        System.out.println(list.size());*/
        /*String[] str1 = {};
        String[] str2 = new String[0];
        System.out.println(str2==null);*/

        /*List<String> EMPTY_AF = Collections
                .unmodifiableList(Arrays.asList(new String[0]));
        System.out.println(EMPTY_AF.size());*/
       /* System.out.println(EMPTY_AF);

        List<String> list = new ArrayList<String>();
        list.add("xxj");
        list.add("xxr");
        EMPTY_AF = list;
        EMPTY_AF.add("xxa");
        System.out.println(EMPTY_AF);*/
        //System.out.println("xxjsmile\r\nxxj\t123\r\nxxj123");
        //Class cla2 = jdk.net.SocketFlow.class;
//        Class targetclass = Timestamp.class;
//        String className = targetclass.getName();
//        className = className.replace('.', '/');
//        String resource = "/" + className + ".class";
//        URL url = targetclass.getResource(resource);
//        System.out.println(url.getFile());
//
//       Class cla =  Class.forName("java.sql.Timestamp");
//        System.out.println(cla);

        //ClassLoader.getPlatformClassLoader().loadClass("")

        List<String> list = Collections
                .unmodifiableList(Arrays.asList(new String[0]));


        List<String> list1 = new ArrayList<>();

        list1.add("xxj");
        list = list1;
        System.out.println(list.size());


    }
}
