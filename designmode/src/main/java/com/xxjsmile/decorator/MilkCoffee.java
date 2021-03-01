package com.xxjsmile.decorator;

import java.math.BigDecimal;

public class MilkCoffee extends CoffeeDecorator {

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "-milk";
    }

    private Coffee coffee;


    @Override
    public BigDecimal cost() {
        return new BigDecimal(8.00D).add(coffee.cost());
    }
}
