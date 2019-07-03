package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();

        int iA = Integer.parseInt(a);
        int iB = Integer.parseInt(b);
        int iC = Integer.parseInt(c);

        if(iA+iB > iC && iA+iC > iB && iB+iC > iA ){
            System.out.println("Треугольник существует.");
        } else  {
            System.out.println("Треугольник не существует.");
        }
    }
}