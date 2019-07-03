package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int [] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int x = 0; x <20; x++) {
            arr[x] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int x = 0; x<array.length; x++) {
            if (max<array[x]){
                max = array[x];
            }
        }
        return max;
    }
}
