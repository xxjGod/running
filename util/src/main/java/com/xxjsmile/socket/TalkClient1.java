package com.xxjsmile.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TalkClient1 {
    public static void main(String[] args) {
        try {
            //向本机的4700端口发出客户请求
            Socket socket = new Socket("127.0.0.1", 4700);
            System.out.println("我是1" + socket.hashCode() + socket.toString());
            //由系统标准输入设备构造BufferedReader对象
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
            //由Socket对象得到输出流，并构造PrintWriter对象
            PrintWriter os = new PrintWriter(socket.getOutputStream());
            //由Socket对象得到输入流，并构造相应的BufferedReader对象
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "";
            //如果该字符串为 "bye"，则停止循环
            while (!line.equals("bye")) {
                //向客户端输出该字符串
                if (!"".equals(line)) {
                    os.println(line);
                    //刷新输出流，使Client马上收到该字符串
                    os.flush();
                }
                System.out.println("服务端正在输入请等待。。。\r\n");
                String serverMsg = is.readLine();
                System.err.println("来自服务端的消息：" + serverMsg);
                //从系统标准输入读入一字符串
                System.out.println("请您输入。。。\r\n");
                line = sin.readLine();
            }
            os.close(); //关闭Socket输出流
            is.close(); //关闭Socket输入流
            socket.close(); //关闭Socket
        } catch (Exception e) {
            e.printStackTrace();//出错，打印出错信息
        }

    }

}