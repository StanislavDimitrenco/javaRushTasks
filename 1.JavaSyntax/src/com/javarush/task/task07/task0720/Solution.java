package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0, l = 0; i < y; i++) {
            String j = list.get(l);
            list.remove(l);
            list.add(j);
        }

        for (String l : list) {
            System.out.println(l);
        }
    }
}
