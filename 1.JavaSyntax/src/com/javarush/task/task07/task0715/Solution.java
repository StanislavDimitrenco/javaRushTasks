package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add(0,"мама");
        list.add(1,"именно");
        list.add(2,"мыла");
        list.add(3,"именно");
        list.add(4,"раму");
        list.add(5,"именно");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
