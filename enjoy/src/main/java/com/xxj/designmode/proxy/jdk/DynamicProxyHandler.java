package com.xxj.designmode.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2023/6/20 6:46 PM
 */

public class DynamicProxyHandler implements InvocationHandler {

    private Object target;

    public DynamicProxyHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("begin");
        Object invoke = method.invoke(target, args);
        System.out.println("end");
        return invoke;
    }
}
