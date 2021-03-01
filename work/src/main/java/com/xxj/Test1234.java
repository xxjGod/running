package com.xxj;

import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Test1234 {


    public static void main(String[] args) throws ClassNotFoundException {

//        System.out.println("\"T\"");
//        System.out.println(Boolean[].class);
//        System.out.println(Boolean.class);
//        System.out.println(boolean[].class);
//        System.out.println(boolean.class);
        //System.out.println((Long)null);
//        Integer m = 5;
//        System.out.println(m instanceof Number);
       // record.get(".STAGES")
//        if (0 != ((Integer) 2 & 2)){
//            System.out.println("123");
//        }
//        if (0 != ((Integer) 4 & 4)){
//            System.out.println("123");
//        }
//        System.out.println(0 != ( 0x20 & 0x20));
//        System.out.println(0x20);

//        int prefetchFlags =8;
//        if (0 != (prefetchFlags & 1)) {
//            System.out.println(1);
//            //record.put(CLASS_NAME, ctx.getClassName());
//        }
//
//        if (0 != (prefetchFlags & 2)) {
//            System.out.println(2);
//            //record.put(METHOD_NAME, ctx.getMethodName());
//        }
//
//        if (0 != (prefetchFlags & 4)) {
//            System.out.println(4);
//            //record.put(CLASS_SNAME, ctx.getShortClassName());
//        }
//
//        if (0 != (prefetchFlags & 8)) {
//            System.out.println(8);
//            //record.put(PACKAGE_NAME, ctx.getPackageName());
//        }


        //System.out.println(needsCtxAttr(1));
        //System.out.println(16&0);
        //1 2 4 8
        //System.out.println(8&8);

//        String str = "com.xxj.bean";
//        String packagePath = str.replace(".", "/");
//        URL resource = Thread.currentThread().getContextClassLoader().getResource(packagePath);
//        System.out.println(resource.getProtocol());
//        System.out.println(resource.getPath());
//        File file = new File(resource.getPath());
//        File[] files = file.listFiles();
//        for (File file1:
//        files) {
//            String name = file1.getName();
//            if(name.endsWith(".class")){
//                String className = str+"."+name.substring(0,name.indexOf("."));
//                Class<?> aClass = Class.forName(className);
//                System.out.println(aClass);
//            }
//
//        }

        testUrlConnect();

    }

    private static void testUrlConnect() {
//        URL realUrl = new URL("");
//        // 打开和URL之间的连接
//        URLConnection conn = realUrl.openConnection();
//        System.out.println(conn);






    }

    private static boolean needsCtxAttr(int attr) {
        for (int flags : new int[] { 0, 0, 16 }) {
            if (0 == (flags & 0) && 0 != (flags & attr)) {
                return true;
            }
        }

        return false;
    }

}
