package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = reader.readLine();

        int x = Integer.parseInt(s);
        int y = Integer.parseInt(s2);

        if(x > y) {
            System.out.println(y);
        } else if (x == y) {
            System.out.println(x);
        } else {
            System.out.println(x);
        }

    }
}