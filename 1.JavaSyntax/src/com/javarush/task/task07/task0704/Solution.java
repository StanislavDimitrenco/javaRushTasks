package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [ ] arrI = new int[10];

        for (int x = 0; x<10; x++) {
            arrI[x] = Integer.parseInt(reader.readLine());
        }

        for (int i = 9; i>=0; i--) {
            System.out.println(arrI[i]);

        }
    }
}

