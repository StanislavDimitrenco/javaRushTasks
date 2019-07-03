package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.weight = 1;
        this.age = 1;
        this.color = "black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "black";
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 1;
    }



    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }





    public static void main(String[] args) {

    }
}
