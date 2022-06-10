package com.testspring.testspring;

import java.util.Date;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //atribuição por valor

        a++;
        b--;

        System.out.println(a + " " + b);
        AreaCirc d1 = new AreaCirc(10);
        AreaCirc d2 = d1; // atribuição por referencia (objeto)

        d1.raio = a++;
//        d2.raio = a--;
        System.out.println(d1.area());
        System.out.println(d2.area());
    }
}
