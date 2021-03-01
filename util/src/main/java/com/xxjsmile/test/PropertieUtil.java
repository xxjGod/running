package com.xxjsmile.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertieUtil {


    public static void main(String[] args) {

        //System.out.println(System.getProperty("user.dir"));

//        InputStream is = PropertieUtil.class.getClassLoader().getResourceAsStream("property/xxj.properties");
//
//        System.out.println(is);
//
//        InputStream is2 = PropertieUtil.class.getResourceAsStream("/property/xxj.properties");
//
//        System.out.println(is2);
        //String path = new File("").getAbsoluteFile().getPath();
        //System.out.println(System.getProperty("java.class.path"));
        String path = "/Users/xiaoxiangjie/testproject/running/util/common.ini";
        System.out.println(path);
        Properties ps = new Properties();
        loadCfg(ps, path);

        System.out.println(ps.getProperty("SendDomain"));


    }

    public static Properties loadCfg(Properties properties, String propPath
    ) {
        InputStream is = null;
        try {
            is = new FileInputStream(propPath);
            properties.load(is);
            return properties;
        } catch (Exception e) {

        } finally {
            if (is != null)
                try {
                    is.close();
                } catch (Exception e) {

                }
        }

        return null;
    }
}
