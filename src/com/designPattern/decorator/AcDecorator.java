package com.designPattern.decorator;

public class AcDecorator implements Decorator{
    private  Car car;

    public AcDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String Description() {
        return car.Description()+" adding AC.";
    }

    @Override
    public int getCost() {
        return car.getCost()+102;
    }
}
