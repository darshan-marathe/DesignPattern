package com.designPattern.factory;

//Product
public interface Currency {
    String getSymbol();
}


class Rupee implements Currency {
    @Override
    public String getSymbol() {
        return "Rs";
    }
}

// Concrete SGD class Code
class SGDDollar implements Currency {
    @Override
    public String getSymbol() {
        return "SGD";
    }
}

// Concrete US Dollar code
class USDollar implements Currency {
    @Override
    public String getSymbol() {
        return "USD";
    }
}