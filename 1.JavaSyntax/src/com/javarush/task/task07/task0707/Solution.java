package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<>();

        for (int x = 0; x<5; x++) {
            listOfStrings.add("Номер строки " + (x + 1));
        }

        System.out.println(listOfStrings.size());

        for (int x = 0; x<5; x++) {
            System.out.println(listOfStrings.get(x));
        }
    }
}
