package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top = 0;
    private int left = 0;
    private int width = 0;
    private int height = 0;

    public void initialize(int width, int height, int left, int top) {
        this.width = width;
        this.height = height;
        this.left = left;
        this.top = top;
    }

    public void initialize(int width, int left, int top) {
        this.width = width;
        this.height = width;
        this.left = left;
        this.top = top;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
    }

    public void initialize(Rectangle obj) {

    }

    public static void main(String[] args) {

    }
}
