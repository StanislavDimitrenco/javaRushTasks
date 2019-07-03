package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));

        }

        for (Integer list : mainList) {
            int x = list;
            if (x%3==0) {
                list3.add(x);
            }

            if (x%2==0 ) {
                list2.add(x);
            }

            if (x%3!=0 && x%2!=0) {
                listOther.add(x);
            }


        }

        printList(list3);
        printList(list2);
        printList(listOther);





    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer l : list) {
            System.out.println(l);
        }
    }
}
