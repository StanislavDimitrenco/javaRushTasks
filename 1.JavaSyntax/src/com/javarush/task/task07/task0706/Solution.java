package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int even = 0;
        int odd = 0;

        int [] arr = new int [15];

        for (int x = 0; x < 15; x++) {
            if (x % 2 == 0) {
                arr[x] = Integer.parseInt(reader.readLine());
                even += arr[x];
            } else {
                arr[x] = Integer.parseInt(reader.readLine());
                odd += arr[x];
            }
        }

        String answer = (even > odd) ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(answer);
    }
}
