package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<String> strings = new ArrayList<>();

        int min = 100000000;
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(i, s);
            if (min > s.length()) {
                min = s.length();
            }

        }

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (s.length() == min) {
                System.out.println(s);
            }
        }
    }
}
