package com.xxj.other;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/10/14 4:42 PM
 */

public class TestAlarm {

    public static void main(String[] args) {

        String kvd = "2.1.80-R-20220904.1116";
        String[] kvdSplit1 = StringUtils.split(kvd, "-");
        String kvdSplitEnd = kvdSplit1[kvdSplit1.length - 1];
        String[] kvdSplit2 = StringUtils.split(kvdSplitEnd, ".");
        String kvdSplitBegin = kvdSplit2[0];
        if (kvdSplitBegin.compareTo("20220906")< 0) {
            //直接报警

            System.out.println(123);
        }


    }


}
