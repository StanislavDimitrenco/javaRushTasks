package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd MM yyyy");
        Date now = new Date();
        String strDate = sdfDate.format(now);

        System.out.println(strDate);


    }
}
