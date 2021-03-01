package com.xxjsmile.decorator;

import java.math.BigDecimal;

public abstract class Coffee {

    public String description = "原味";


    public String getDescription() {


        return description;

    }


    public abstract BigDecimal cost();

}
