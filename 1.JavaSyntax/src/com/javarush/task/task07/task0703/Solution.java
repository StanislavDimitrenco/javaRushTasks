package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] arrS = new String[10];
        int [ ] arrI = new int[10];

        for (int x = 0; x<10; x++) {
            arrS[x] = reader.readLine();
        }

        for (int x = 0; x<10; x++) {
            arrI[x] = arrS[x].length();
            System.out.println(arrI[x]);
        }
    }
}
