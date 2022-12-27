package com.designPattern.decorator;

public class Honda implements Car{
    @Override
    public String Description() {
        return "Honda";
    }

    @Override
    public int getCost() {
        return 50000;
    }
}
