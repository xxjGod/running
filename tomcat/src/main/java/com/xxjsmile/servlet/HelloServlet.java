package com.xxjsmile.servlet;


//import com.xxjsmile.utility.JvmStack;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class HelloServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get:" + req);
        doPost(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet线程id:" + Thread.currentThread().getId());
        //JvmStack.runStack();
        //testokhttp();


        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html><html lang=\"zh\"><head><meta name=\"ajs-server-port\" content=\"443\"></head><body><h1>" + "HelloServlet success! " + "</h1></body></html>");
    }

    private void testokhttp() {
        Request request = new Request.Builder()

                .url("http://10.0.1.49:8080/jdk5test/httpClientServlet").addHeader("xxj", "123")

                .build();


        Response response = null;
        try {
            response = new OkHttpClient().newCall(request).execute();
            System.out.println("@@@@@" + request.headers());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response.isSuccessful()) {
            System.out.println(response.body().toString());
        } else {
            System.out.println("Unexpected code " + response);

        }


    }


    @Override
    public void destroy() {
        super.destroy();
    }


}


