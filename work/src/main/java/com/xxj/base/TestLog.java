package com.xxj.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/6 2:44 PM
 */

public class TestLog {

    public static void main(String[] args) {
        List<InitializeLogging> items = new ArrayList<>();
        items.add(new InitializeLogging());
        items.add(new InitializeLogging());
        items.forEach(BootstrapLogger::bootstrap);
        //Boolean.getBoolean()


    }
}
