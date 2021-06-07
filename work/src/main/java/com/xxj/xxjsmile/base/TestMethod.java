package com.xxj.xxjsmile.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/5/11 11:08
 * All Rights Reserved
 */
public class TestMethod {

    public static void main(String[] args) {

        AtomicInteger m = new AtomicInteger(0);
        Map<String,Object> map = new HashMap<>();
        map.put("param",m);
            test1(map);
        System.out.println(m.get());
        //System.out.println(m.get());

    }

    private static void test1(Map<String,Object> map) {

        AtomicInteger param = (AtomicInteger)map.get("param");
        param.addAndGet(1);
    }

    @Override
    public String toString() {
        return "TestMethod{}";
    }
}
