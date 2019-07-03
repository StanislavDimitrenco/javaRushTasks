package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [ ] arrBig = new int[20];
        int [ ] arrSmall1 = new int[10];
        int [ ] arrSmall2 = new int[10];

        for (int x = 0; x<20; x++) {
            arrBig[x] = Integer.parseInt(reader.readLine());
        }

        for (int x = 0; x < 20; x++) {
            if(x<10) {
                arrSmall1[x] = arrBig[x];
            } else {
                int y = 0;
                System.out.println(arrSmall2[y] = arrBig[x]);
                y++;
            }
        }
    }
}
