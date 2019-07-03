package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        int max = 0;
        int min = 1000000000;

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            strings.add(i, s);

            if(min > s.length()) {
                min = s.length();
                minIndex = i;
            }

            if (max < s.length()) {
                max = s.length();
                maxIndex = i;
            }
        }

        String result = (maxIndex < minIndex) ? strings.get(maxIndex) : strings.get(minIndex);
        System.out.println(result);
    }
}
