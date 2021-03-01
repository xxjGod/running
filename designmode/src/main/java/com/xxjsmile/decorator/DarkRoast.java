package com.xxjsmile.decorator;

import java.math.BigDecimal;

//深度烘焙咖啡   可加🐄可加🍓可加🍌可加豆浆😄😄😄
public class DarkRoast extends Coffee{

    @Override
    public String getDescription() {
        return "darkroast coffee";
    }

    public BigDecimal cost() {
        return new BigDecimal(3.00D);
    }
}
