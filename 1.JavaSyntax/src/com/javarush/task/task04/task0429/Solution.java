package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = {
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine())
        };

        int count1 = 0;
        int count2 = 0;

        for(int x=0; x <3; x++) {
            if(arr[x] > 0) {
                ++count1;
            } else if (arr[x] < 0) {
                ++count2;
            }
        }

        System.out.println("количество отрицательных чисел: " + count2);
        System.out.println("количество положительных чисел: " + count1);

    }
}
