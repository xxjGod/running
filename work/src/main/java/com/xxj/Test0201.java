package com.xxj;

import java.util.*;

public class Test0201 {


    public static void main(String[] args) {
        //String str = "xxj";
//        Map<String, List<String>> map = new HashMap();
//
//        List<String> strings = new ArrayList<>();
//        strings.add("xxj");
//        strings.add("xxr");
//
//        map.put("xxj", strings);
//        System.out.println(map);
        //str = "123";
//        String x = "xxj";
//        System.out.println(str.equals(x));
//        System.out.println(str==x);
        //Properties properties = new Properties();


        //properties.put(null,"123");
        String rootPath = "/data/cloudwise/javaagent/JavaAgent_2.8.2";
        System.out.println(test(rootPath));
        //test123();
        //test1234();
    }

    private static void test1234() {

        String version = "2.8.2";
        String rootPath = "JavaAgent_2.8.2demo1_2.8";
        String bak = "JavaAgent_2.8.2demo1_2.8";

        System.out.println(rootPath.replaceFirst(version,""));

    }

    private static void test123() {
        String rootPath = "/JavaAgent_2.8.2";
        String version = "2.8.2";
        int i = rootPath.lastIndexOf(version);
        String substring = rootPath.substring(0, i);
        System.out.println(substring);

    }


    //    * 根据【主机IP + JavaAgent特殊路径】生成的
//	 * 若/data/cloudwise/javaagent/ 下面有JavaAgent_2.8.3因为pom 2.8.2， 不好意思，免谈!!
//            * 若/data/cloudwise/javaagent/ 下面有JavaAgent_2.8.2 和pom版本一致，因此/data/cloudwise/javaagent/JavaAgent 为生成agentid的因子
//	 * 若/data/cloudwise/javaagent/ 下面有JavaAgent_2.8.2_demo1 和JavaAgent_2.8.2_demo2 包含pom版本一致，因此/data/cloudwise/javaagent/JavaAgentdemo1
//	 * 和 /data/cloudwise/javaagent/JavaAgentdemo2为生成agentid的因子
    private static String test(String rootPath) {

        String version = "2.8.2";
        if (rootPath.contains(version)) {
            if (rootPath.endsWith(version)) {
                int end = rootPath.lastIndexOf(version);
                return rootPath.substring(0, end);
            } else {
                //客户自定义 比如JavaAgent_2.8.2_demo1 或 JavaAgent_2.8.2_demo2 则取JavaAgentdemo1 和JavaAgentdemo2 因子
                return rootPath.replaceFirst(version,"");
            }
        } else {
            //熔断
        }
        return "";
    }
}
