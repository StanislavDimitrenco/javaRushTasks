package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String n1 = r.readLine();
        String n2 = r.readLine();

        if (n1.equals(n2)) {
            System.out.println("Имена идентичны");
        } else if (n1.length() == n2.length()) {
            System.out.println("Длины имен равны");
        }

    }
}
