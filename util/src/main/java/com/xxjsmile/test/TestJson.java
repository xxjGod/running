package com.xxjsmile.test;

import com.google.gson.JsonObject;

import java.net.URL;

public class TestJson {


    public static void main(String[] args) {

        URL url = TestJson.class.getProtectionDomain().getCodeSource().getLocation();

        System.out.println("url = " + url);
    }

}
