package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int x = 0;


        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if(number == -1) {
                System.out.println(sum / x);
                break;
            }

            sum = sum + number;
            x++;
        }
    }
}

