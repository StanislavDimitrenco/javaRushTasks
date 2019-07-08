package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human h1 = new Human("vasia", true, 20);
        Human h2 = new Human("casia", false, 20);
        Human h1a = new Human("vasia", true, 20);
        Human h2b = new Human("casia", false, 20);

        Human h3 = new Human("vasia", true, 20, h1, h2);
        Human h4 = new Human("vasia", true, 20, h1a, h1a);
        Human h5 = new Human("vasia", true, 20, h1, h2);
        Human h6 = new Human("vasia", true, 20, h1a, h1a);
        Human h7 = new Human("vasia", true, 20, h1, h2);

        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h1a.toString());
        System.out.println(h2b.toString());
        System.out.println(h3.toString());
        System.out.println(h4.toString());
        System.out.println(h5.toString());
        System.out.println(h6.toString());
        System.out.println(h7.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}