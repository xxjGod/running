package com.xxj.base;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/6 5:32 PM
 */

public enum MyEnum {


    EVENT1(1) {
        @Override
        public void start() {

            System.out.println("1");
        }

        @Override
        public void end() {

        }
    },

    EVENT2(2) {
        @Override
        public void start() {

        }

        @Override
        public void end() {

        }
    };

    public int level;

    MyEnum(int level) {
        this.level = level;
    }


    public abstract void start();


    public abstract void end();


}
