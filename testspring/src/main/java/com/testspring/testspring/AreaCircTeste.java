package com.testspring.testspring;

import java.awt.geom.Area;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
         a1.raio = 10;
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5);
        a2.raio = 15;

        System.out.println(AreaCirc.area1(17));
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
