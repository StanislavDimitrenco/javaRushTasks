package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader nDay = new BufferedReader(new InputStreamReader(System.in));

        String numberDay = nDay.readLine();

        int numberDayInt = Integer.parseInt(numberDay);

        if (numberDayInt == 1) System.out.println("понедельник");
        if (numberDayInt == 2) System.out.println("вторник");
        if (numberDayInt == 3) System.out.println("среда");
        if (numberDayInt == 4) System.out.println("четверг");
        if (numberDayInt == 5) System.out.println("пятница");
        if (numberDayInt == 6) System.out.println("суббота");
        if (numberDayInt == 7) System.out.println("воскресенье");
        if (numberDayInt < 1 || numberDayInt > 7) System.out.println("такого дня недели не существует");

    }
}