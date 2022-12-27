package com.designPattern.decorator;

public class DecoratorDeign {

    public static void main(String[] args) {

        Car tata = new Tata();// base object
        tata = new AcDecorator(tata); // adding AC functionality run time
        tata = new CameraDecorator(tata); // adding Camera functionality run time
        tata = new CameraDecorator(tata); // adding Double Camera functionality run time
        tata = new SheetCoverDecorator(tata); // adding sheetcover functionality run time
        System.out.println( tata.Description());
        System.out.println( tata.getCost());
        System.out.println();
        System.out.println("******** With only Ac ***********");
        Car tata1 = new Tata();// base object
        tata1 = new AcDecorator(tata1); // adding AC functionality run time
        System.out.println( tata1.Description());
        System.out.println( tata1.getCost());
    }
}
