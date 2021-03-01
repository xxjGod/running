package com.xxj;

import java.io.*;
import java.util.Properties;

public class TestMain {

    // volatile


    public static void main(String[] args) throws Exception {
        /*Properties properties = new Properties();
        properties.setProperty("xxj","1212");
        properties.put()*/
        //loadCfg(new Properties(),"/Users/xiaoxiangjie/testproject/running/work/xxjsmile/123_.txt",true);
//        if("[auto]".equals("[auto]")){
//            System.out.println("123");
//        }
        //createFile();
        Properties properties = new Properties();
        System.out.println(properties.getProperty("xxj"));
        FileInputStream file = new FileInputStream("/Users/xiaoxiangjie/IdeaProjects/code-instrument-java/JavaAgent/conf/common.ini");
        System.out.println(file);

    }


    /**
     * 获取jdk版本
     */
    private static void getJdkVersion() {
        String version = System.getProperty("java.version");

        if (version.startsWith("1.")) {

            version = version.substring(2, 3);

        } else {
            int pos = version.indexOf(".");
            if (pos != -1) {
                version = version.substring(0, pos);
            }

        }
        //tomcat  应用 appname
        //java -jar
        if (Integer.parseInt(version) > 8) {
            System.out.println("大于8version" + version);
        } else {
            System.out.println("不大于8version" + version);
        }

    }

    /**
     * 创建文件
     */
    private static void createFile() {

        File jarFile = new File("/Users/xiaoxiangjie/testproject/running/work/xxjsmile");

        try {
            if (jarFile.exists()) {
                System.out.println("删除啦");
                jarFile.delete();
            }//获取父目录
            if (!jarFile.exists()) {
                jarFile.mkdirs();
            }

            File jarFile1 = new File("/Users/xiaoxiangjie/testproject/running/work/xxjsmile/123.txt");
            //jarFile1.createNewFile();
            //jarFile.createNewFile();
//
//            File fileParent = jarFile.getParentFile();
//            //判断是否存在
//            if (!fileParent.exists()) {
//                System.out.println("创建不存在目录");
//                //创建父目录文件
//                fileParent.mkdirs();
//            }
//            jarFile.createNewFile();

            //创建文件啦
            FileOutputStream os = new FileOutputStream(jarFile1);
            PrintStream out = new PrintStream(os);
            System.out.println("xxjsmile123");

        } catch (Exception ex) {
            System.out.println("error:" + ex);
        }


    }

    /**
     * 创建文件，重命名
     *
     * @throws Exception
     */
    private static void cpyFile() throws Exception {

        File jarFile = new File("/Users/xiaoxiangjie/testproject/running/work/xxjsmile/123.txt");
        //jarFile.createNewFile();
        System.out.println(jarFile.getPath());

        //会创建文件
        FileOutputStream os = new FileOutputStream(jarFile);
        PrintStream out = new PrintStream(os);
        out.println("xxjsmile");
        File nf = new File("/Users/xiaoxiangjie/testproject/running/work/xxjsmile/123_0.txt");
        jarFile.renameTo(nf);
    }

    public static Properties loadCfg(Properties properties, String propPath,
                                     boolean verbose) {
        InputStream is = null;
        try {
            is = new FileInputStream(propPath);
            properties.load(is);
            System.out.println(properties.getProperty("xxjsmile"));
            return properties;
        } catch (Exception e) {
            if (verbose) {
                System.out.println(e);
            }
        } finally {
            if (is != null)
                try {
                    is.close();
                } catch (Exception e) {
                    if (verbose) {

                    }
                }
        }

        return null;
    }


}
