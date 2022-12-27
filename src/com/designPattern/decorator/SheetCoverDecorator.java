package com.designPattern.decorator;

public class SheetCoverDecorator implements Decorator{
    private  Car car;

    public SheetCoverDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String Description() {
        return car.Description()+" adding sheetcover,";
    }

    @Override
    public int getCost() {
        return car.getCost()+ 200;
    }
}
