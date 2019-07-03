package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static int minus(int a, int b) {
        int def = a - b;
        return def;
    }

    public static int multiply(int a, int b) {
        int mult = a*b;
        return mult;
    }

    public static double division(int a, int b) {
        double div = (double) a/ (double)b;
        return div;
    }

    public static double percent(int a, int b) {
        double perc = (double)a*((double)b/100);
        return perc;
    }

    public static void main(String[] args) {

    }
}