package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        String n = number.readLine();

        int nInt = Integer.parseInt(n);

        if(nInt > 0) {
            System.out.println(nInt*2);
        } if(nInt < 0 ) {
            System.out.println(nInt+1);
        } if(nInt == 0 ) {
            System.out.println(nInt);
        }

    }

}