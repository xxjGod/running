package com.xxjsmile.utility;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RemoteTest {


    public static void main(String[] args) {
        test123();
    }

    public static void test123() {
        try {
            URL url = new URL("http://10.0.4.217:7001/jdk5test/helloWorldRemote2");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);

            String testData = "";
            for (int i = 0; i < 1000; i++) {
                testData += i;
            }

            //HttpUrlConnectionServlet connection:sun.net.www.protocol.http.HttpURLConnection:http://10.0.4.217:7001/jdk5test/helloWorldRemote2
            //HttpUrlConnectionServlet inputStream:sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@402e11


            //sun.net.www.protocol.http.HttpURLConnection.connect(716)
            //HttpUrlConnectionServlet connection:sun.net.www.protocol.http.HttpURLConnection:http://10.0.4.217:7001/jdk5test/helloWorldRemote2
            //HttpUrlConnectionServlet inputStream:sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@45a151cd


            httpURLConnection.getOutputStream().write(("testData=" + testData).getBytes());

            System.out.println("HttpUrlConnectionServlet connection:" + httpURLConnection);
            //begin = System.currentTimeMillis();
            InputStream inputStream = httpURLConnection.getInputStream();

            System.out.println("HttpUrlConnectionServlet inputStream:" + inputStream);
            //end = System.currentTimeMillis();
            //System.out.println(" httpURLConnection.getInputStream() : "+(end-begin));

//        sun.net.www.protocol.http.HttpURLConnection
            //begin=System.currentTimeMillis();
            while (inputStream.read() != -1) {
            }
            //end=System.currentTimeMillis();
            inputStream.close();
            httpURLConnection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
