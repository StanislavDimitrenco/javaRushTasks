package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(r.readLine());
        int n2 = Integer.parseInt(r.readLine());
        int n3 = Integer.parseInt(r.readLine());

        if(n2 == n3) {
            System.out.println(1);
        } else if (n1 == n3) {
            System.out.println(2);
        } else if (n1 == n2) {
            System.out.println(3);
        }

    }
}
