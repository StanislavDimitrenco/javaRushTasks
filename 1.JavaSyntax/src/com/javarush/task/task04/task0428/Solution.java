package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());

        int [] arr = {n, n2, n3};

        int count = 0;

        for(int x=0; x <3; x++) {
            if(arr[x] > 0) {
                ++count;
            }
        }

        System.out.println(count);

    }
}
