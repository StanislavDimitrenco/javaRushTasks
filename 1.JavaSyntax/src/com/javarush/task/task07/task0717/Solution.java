package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new BufferedReader(new InputStreamReader(System.in)).readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String res : result) {
            System.out.println(res);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int size = list.size()*2;
        for (int x = 0; x < size; x++) {
            String s = list.get(x);
            list.add(x +1, s);
            x++;
        }
        return list;
    }
}
