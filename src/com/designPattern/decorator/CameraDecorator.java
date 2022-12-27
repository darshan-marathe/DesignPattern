package com.designPattern.decorator;

public class CameraDecorator implements Decorator{
    private Car car;

    public CameraDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String Description() {
        return car.Description()+" adding camera";
    }

    @Override
    public int getCost() {
        return car.getCost()+100;
    }
}
