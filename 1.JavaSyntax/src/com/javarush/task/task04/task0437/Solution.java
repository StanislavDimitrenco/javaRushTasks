package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for(int x = 0; x<10; ++x) {
            i(x);
            System.out.println();
        }



    }

    static void i(int x) {

        for (int y = 0; y<=x; ++y )
        System.out.print(8);
    }
}
