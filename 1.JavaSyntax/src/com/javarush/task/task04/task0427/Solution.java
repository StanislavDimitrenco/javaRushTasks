package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(r.readLine());

        if(i>0 && i<10 && i%2 == 0) {
            System.out.println("четное однозначное число");

        } else if(i>0 && i<10 && i%2 == 1) {
            System.out.println("нечетное однозначное число");

        } else if(i>9 && i<100 && i%2 == 0) {
            System.out.println("четное двузначное число");

        } else if(i>9 && i<100 && i%2 == 1) {
            System.out.println("нечетное двузначное число");

        } else if(i>99 && i<1000 && i%2 == 0) {
            System.out.println("четное трехзначное число");

        } else if(i>99 && i<1000 && i%2 == 1) {
            System.out.println("нечетное трехзначное число");

        }

    }
}
