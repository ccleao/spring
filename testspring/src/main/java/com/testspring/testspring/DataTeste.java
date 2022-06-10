package com.testspring.testspring;

public class DataTeste {
    public static void main(String[] args) {


    Data d1 = new Data();

    var d2 = new Data(31, 12, 2020);

    //Ex 1
    String formatDate = d1.obtainDateFormat();
    System.out.println(formatDate);
    //Ex 2
    System.out.println(d2.obtainDateFormat());
}
}