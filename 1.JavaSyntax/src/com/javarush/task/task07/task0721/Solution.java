package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        int [] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = 0;

        for (int a : arr) {

            if(maximum < a) {
                maximum = a;
            }
        }

        int minimum = maximum;

        for (int a : arr) {
            if(minimum > a) {
                minimum = a;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
