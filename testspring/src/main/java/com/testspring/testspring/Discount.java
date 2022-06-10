package com.testspring.testspring;

public class Discount {

    static final double discount = (1-0.25);
    double price;

    Discount(double p1){
        price = p1;
    }

     double RealPrice(){
        return price*(discount);
    }
}
