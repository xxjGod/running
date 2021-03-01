package com.xxjsmile.socket;


import java.net.*;

public class TalkServer {
    public static void main(String args[]) {
        try {
            ServerSocket server = null;
            try {
                //创建一个ServerSocket在端口4700监听客户请求
                server = new ServerSocket(4700);
            } catch (Exception e) {
                e.printStackTrace();//出错，打印出错信息
            }
            new Thread(new TalkServerThread(server, "黄金客服")).start();

            new Thread(new TalkServerThread(server, "白银客服")).start();

        } catch (Exception e) {
            e.printStackTrace();//出错，打印出错信息
        }
    }
}