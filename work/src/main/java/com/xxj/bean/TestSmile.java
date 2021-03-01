package com.xxj.bean;

public class TestSmile {


    public static void main(String[] args) {

        //String finalStr = "";

        //Object[] objects = new Object[]{12, "34"};
        //String str = "update tb_data set data1=? where data1=?";

//        int i = str.indexOf("?");
//        String begin = str.substring(0, i);
//        String h1 = finalStr + begin + 12;
//        int m = str.lastIndexOf("?");
//
//        String end = str.substring(i + 1, m);
//        String h2 = end + 34;
//        System.out.println(h1 + h2);
        String str = "update tb_data set data1=? where data1=?,? and ?";
        Object[] objects = new Object[]{12, "34", "a", 'a'};
        System.out.println(getFinal(str, objects));

        StringBuffer stringBuffer = new StringBuffer();
//        char c = 'a';
//        for (Object
//                obj :
//                objects) {
//
//            stringBuffer.append(obj);
//            //System.out.println(obj);
//        }
        //System.out.println(("xxj"+"").length());
    }

    //static String str = "update tb_data set data1=? where data1=?,? and ?";

    //static Object[] objects = {12, "34", 56, "test"};
    private static String getFinal(String sql, Object[] objects) {
        char[] chars = sql.toCharArray();
        StringBuilder stringBuffer = new StringBuilder();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                //替换
                if (objects[index] instanceof String ||objects[index] instanceof Character) {
                    stringBuffer.append("'" + objects[index++] + "'");
                } else {
                    stringBuffer.append(objects[index++]);
                }

            } else {
                stringBuffer.append(chars[i]);
            }
        }
        //System.out.println(stringBuffer.toString().length());
        return stringBuffer.toString();
    }
}
