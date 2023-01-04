package com.xxj.base;

/**
 * @Description:
 * @Author: xiaoxiangjie
 * @CreateTime: 2022/9/13 2:18 PM
 */

public class BaseObject {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseObject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BaseObject{" +
                "name='" + name + '\'' +
                '}';
    }
}
