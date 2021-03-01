package com.base.clone;

import java.io.*;

public class Bird implements Serializable {


    private String name;

    private Food food;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", food=" + food +
                '}';
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }




}
