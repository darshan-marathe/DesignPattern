package com.designPattern.decorator;

public class Tata implements Car{
    @Override
    public String Description() {
        return "Tata car";
    }

    @Override
    public int getCost() {
        return 10000;
    }
}
