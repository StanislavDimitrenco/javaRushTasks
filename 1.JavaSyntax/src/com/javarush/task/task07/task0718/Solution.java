package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new BufferedReader(new InputStreamReader(System.in)).readLine());
        }

        for (int i = 0; i < 9; i++) {
            String s = list.get(i);
            String s2 = list.get(i+1);
            if (s2.length() < s.length()) {
                System.out.println(i + 1);
                break;
            }
        }



    }
}

