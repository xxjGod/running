package com.base.form;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/8/26 3:48 PM
 */

public class TestForm {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        testList(list);

    }

    private static void testList(List<? extends String> list) {
    }


}
