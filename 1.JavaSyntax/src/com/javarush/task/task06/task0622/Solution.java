package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <Integer> arr = new ArrayList<Integer>();

        for (int x=0; x<5; x++) {
            arr.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(arr);

        for (int x=0; x<5; x++) {
            System.out.println(arr.get(x));
        }


    }
}
