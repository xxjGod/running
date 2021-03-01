package com.xxjsmile.util;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public class TestMain {

    public static void main(String[] args) throws Exception {
        //System.out.println(System.getProperty("java.class.path"));

//        StringBuilder str = new StringBuilder();
//        System.out.println(str.length());


        InputStream input = TestMain.class.getResourceAsStream("/db.properties");

        ByteArrayOutputStream baos = cloneInputStream(input);

        // 打开两个新的输入流
        InputStream stream1 = new ByteArrayInputStream(baos.toByteArray());
        //我们用

        InputStream iss = stream1;
        byte[] bytes = new byte[1024];
        int len;
        while ((len = iss.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len, "UTF-8"));

        }


        InputStream stream2 = new ByteArrayInputStream(baos.toByteArray());
        //input = stream2;

        InputStream isss = stream2;
        byte[] bytess = new byte[1024];
        int lens;
        while ((lens = isss.read(bytess)) != -1) {
            System.out.println(new String(bytess, 0, lens, "UTF-8"));

        }


//        InputStream iss =  is;
//        byte[] bytes = new byte[1024];
//        int len;
//        while((len=iss.read(bytes))!=-1){
//            System.out.println( new String(bytes, 0, len , "UTF-8"));
//
//        }
//
//
//
//        while((len=is.read(bytes))!=-1){
//            System.out.println( new String(bytes, 0, len , "UTF-8"));
//
//        }

    }


    private static ByteArrayOutputStream cloneInputStream(InputStream input) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = input.read(buffer)) > -1) {
                baos.write(buffer, 0, len);
            }
            baos.flush();
            return baos;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }
}
