package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public  static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {

    }

    public static void main(String[] args) {
        for (int x=0; x<10; x++) {
            Cat cat = new Cat();
            Cat.cats.add(cat);
        }

        printCats();
    }

    public static void printCats() {
        for(Object cat:cats) {
            System.out.println(cat);
        }
    }
}
