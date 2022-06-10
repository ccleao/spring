package com.testspring.testspring;

public class Data {

    int day;
    int month;
    int year;

    Data() {
//        day = 1;
//        month = 1;
//        year = 1970;
        this(1, 1, 1999);
    }
    Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    String obtainDateFormat(){
        final String format = "%d/%d/%d";
        return String.format(format, day, month, year);
    }
}
