package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int x = 0;
        int [] num = new int[firstNumber];
        while(x < firstNumber) {
            int number = Integer.parseInt(reader.readLine());
            num[x] = number;
            x++;
        }

        int maximum = num[0];

        for(int i = 0; i < num.length; i++ ) {
            if(maximum < num[i]) {
                maximum = num[i];
            }
        }

        System.out.println(maximum);
    }
}
