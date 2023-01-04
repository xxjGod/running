package com.xxj.base;

import lombok.Getter;
import lombok.Setter;


public enum MyEnum2 {

    EVENT1(1),

    EVENT2(2);

    public int level;
    public int num;


    MyEnum2(int level) {
        this.level = level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public static void main(String[] args) {
        MyEnum2 event1 = MyEnum2.EVENT1;
        event1.setLevel(3);
        System.out.println(event1.level);
    }
}
