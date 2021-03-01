package com.xxj.bean;

public class Student {

    private String name;

    private Integer age;


    static {
        System.out.println("static init");

    }

    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setInfo(String name,Integer age,Car car,Integer[] integers,String[] strings,char[] chars,int[] ints,Long[] l,long[] l1,Class[] c,double[] d,boolean[] b,Boolean[] B){
        this.name=name;
        this.age=age;
        this.car=car;
    }

    private void test(){

    }
}
