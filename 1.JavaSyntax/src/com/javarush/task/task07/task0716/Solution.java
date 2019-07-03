package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        String l = "л", r = "р";
        for (int x = 0; x < strings.size(); x++) {
            String s = strings.get(x);

            if (s.contains(l) && !s.contains(r)) {
                strings.add(x+1,s);
                x++;

            }

            else if (s.contains(r) && !s.contains(l)) {
                strings.remove(x);
                x--;
            }


        }

        return strings;
    }
}