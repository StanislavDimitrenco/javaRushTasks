package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int x =0;
        int y =0;
        if (anotherCat.age < this.age) {
            x = x +1;
        }

        if (anotherCat.weight < this.weight) {
            x = x +1;
        }

        if (anotherCat.strength < this.strength) {
            x = x +1;
        }

        if (anotherCat.age > this.age) {
            y = y +1;
        }

        if (anotherCat.weight > this.weight) {
           y = y +1;
        }

        if (anotherCat.strength > this.strength) {
            y = y +1;
        }

        if(x>y) {
            return true;
        } else if (x<y) {
            return false;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.strength = 1;
        cat1.weight = 1;

        Cat cat2 = new Cat();
        cat2.age = 1;
        cat2.strength = 1;
        cat2.weight = 1;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
