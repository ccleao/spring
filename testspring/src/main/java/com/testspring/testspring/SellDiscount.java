package com.testspring.testspring;

public class SellDiscount {
    public static void main(String[] args) {

        double p1 = 150.50;
        double p2 = 200;
        double p3 = 100;

        System.out.println(Discount.discount*p1);
        System.out.println(Discount.discount*p2);
        System.out.println(Discount.discount*p3);
    }
}
