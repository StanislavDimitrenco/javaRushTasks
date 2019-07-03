package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;

        while (x<11) {
            y(x);
            x++;
            System.out.println();
        }
    }

    private static void y(int x) {
        int y = 1;
        while (y<11) {
            System.out.print(x*y + " ");
            y++;
        }
    }


}
