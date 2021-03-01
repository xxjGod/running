package com.xxjsmile.decorator;

import java.math.BigDecimal;

public class StrawberryCoffee extends CoffeeDecorator {

    public StrawberryCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "-strawberry";
    }

    private Coffee coffee;


    @Override
    public BigDecimal cost() {
        return new BigDecimal(2.00D).add(coffee.cost());
    }

}