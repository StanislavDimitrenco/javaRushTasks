package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String time = reader.readLine();

        double tD = Double.parseDouble(time);
        int t = (int) tD;

        t = t % 10;

        if(t == 3 || t == 8) {
            System.out.println("желтый");
        } else if (t == 4 || t == 9) {
            System.out.println("красный");
        } else {
            System.out.println("зелёный");
        }
    }
}