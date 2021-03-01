package com.xxjsmile.decorator;

public class TestCoffee {

    public static void main(String[] args) {

        Coffee coffee = new DarkRoast();

        coffee = new MilkCoffee(coffee);

        coffee = new StrawberryCoffee(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());

    }
}
