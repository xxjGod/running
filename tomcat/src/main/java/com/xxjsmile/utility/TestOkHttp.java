package com.xxjsmile.utility;


import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestOkHttp {

    public static void main(String[] args) throws Exception {
        /*Request request = new Request.Builder()

                .url("http://10.0.1.49:8080/jdk5test/httpClientServlet")

                .build();*/

        /*Class innerClazz[] = request.getClass().getDeclaredClasses();
        for (Class cls:
        innerClazz) {
            Field field =cls.getDeclaredField("headers");
            field.setAccessible(true);
            //Object obj = cls.newInstance();
            Object obj = request.newBuilder();
            //System.out.println(field.get(obj));
            Object headers = field.get(obj);
            Method m = headers.getClass().getDeclaredMethod("add",new Class[] { String.class,String.class });
            m.setAccessible(true);
            m.invoke(headers,new Object[]{"CLOUDWISE", "123"});
            System.out.println(m);

        }*/
        //Field field = request.getClass().getDeclaredField("headers");


        //headers
       /* Method method1 = request.getClass().getDeclaredMethod("newBuilder");
        Object o1 = method1.invoke(request,null);
        Method method2 = o1.getClass().getDeclaredMethod("addHeader",new Class[] { String.class,String.class });
        Object o2 = method2.invoke(o1, new Object[]{"xxj", "123"});
        request.newBuilder().build();
        System.out.println("xxjsmile");*/
        //Request.Builder builder = new Request.Builder()
        //.url("http://10.0.1.49:8080/jdk5test/httpClientServlet");
        // request.newBuilder()
        // Request.Builder xx = builder
        //builder.addHeader("CLOUDWISE","123");
        //Request request = builder.build();


        /*Request request2 = new Request.Builder()
                .url("http://10.0.1.49:8080/jdk5test/httpClientServlet").addHeader("CLOUDWISE","123").addHeader("xxj","123")

                .build();*/
        Request request2 = new Request.Builder()
                .url("http://10.0.1.49:8080/jdk5test/httpClientServlet").addHeader("xxj", "123").addHeader("CLOUDWISE", "22")

                .build();

        Headers headers = request2.headers();
        Field field = headers.getClass().getDeclaredField("namesAndValues");
        field.setAccessible(true);
        String[] ago = (String[]) field.get(headers);
        String[] str = new String[ago.length + 2];

        for (int i = 0; i < ago.length; i++) {
            str[i] = ago[i];
        }
        str[str.length - 2] = "CLOUDWISE";
        str[str.length - 1] = "987";
        field.set(headers, str);

        System.out.println(str);
        Response response = null;
        try {
            response = new OkHttpClient().newCall(request2).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response.isSuccessful()) {
            System.out.println(response.body().toString());
        } else {
            System.out.println("Unexpected code " + response);

        }
    }
}
