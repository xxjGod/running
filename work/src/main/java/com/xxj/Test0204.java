package com.xxj;

public class Test0204 {


    public static void main(String[] args) {

        try{
            int i = 10/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getCause());
        }


    }
}
