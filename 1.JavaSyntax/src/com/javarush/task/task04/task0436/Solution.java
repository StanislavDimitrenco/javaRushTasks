package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

         int x = Integer.parseInt(r.readLine());
         int y = Integer.parseInt(r.readLine());

        for (int z = 0; z < x; z++) {
            for (int zm = 0; zm < y; zm++ ) {
                System.out.print(8);
            }
            System.out.println();
        }



    }


}
