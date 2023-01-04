package com.xxj.base;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/6 2:43 PM
 */

public class InitializeLogging implements BootstrapLogger {
    @Override
    public void bootstrap() {
        System.out.println("123");
    }
}
