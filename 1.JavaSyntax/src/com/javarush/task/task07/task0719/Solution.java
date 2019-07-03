package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        }

        int size = list.size();

        for (int i = size -1; i >= 0; i--) {

            System.out.println(list.get(i));
        }
    }
}
