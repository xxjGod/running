package com.xxjsmile.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TalkServerThread implements Runnable {


    private ServerSocket server;

    private String name;

    public TalkServerThread(ServerSocket serverSocket, String name) {
        this.server = serverSocket;
        this.name = name;
    }


    @Override
    public void run() {

        Socket socket = null;
        try {
            //使用accept()阻塞等待客户请求，有客户
            socket = server.accept();//请求到来则产生一个Socket对象，并继续执行

            System.out.println(name + socket.hashCode() + socket.toString());

            //由Socket对象得到输入流，并构造相应的BufferedReader对象
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //由Socket对象得到输出流，并构造PrintWriter对象
            PrintWriter os = new PrintWriter(socket.getOutputStream());
            //由系统标准输入设备构造BufferedReader对象
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("########" + name + "聊天室开始########");
            String firstMsg = "########" + name + "为您服务！########";
            String line = firstMsg;
            //如果该字符串为 "bye"，则停止循环
            while (!line.equals("bye")) {
                //向客户端输出该字符串
                if (!"".equals(line)) {
                    os.println(line);
                    //刷新输出流，使Client马上收到该字符串
                    os.flush();
                }
                System.out.println(name + "客户端正在输入请等待。。。\r\n");
                String clientMsg = is.readLine();
                System.err.println(name + "来自客户端的消息：" + clientMsg);
                //从系统标准输入读入一字符串
                System.out.println(name + "请您输入。。。\r\n");
                line = sin.readLine();
            }

            os.close(); //关闭Socket输出流
            is.close(); //关闭Socket输入流
            socket.close(); //关闭Socket
            server.close(); //关闭ServerSocket
            System.out.println("########" + name + "聊天室开始关闭########");
        } catch (Exception e) {
            e.printStackTrace();//出错，打印出错信息
        }


    }
}
