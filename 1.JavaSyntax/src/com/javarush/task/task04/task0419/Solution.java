package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine(), s2 = r.readLine(), s3 = r.readLine(), s4 = r.readLine();

        int i1 = Integer.parseInt(s), i2 = Integer.parseInt(s2),  i3 = Integer.parseInt(s3),  i4 = Integer.parseInt(s4);

        if (i1 >= i2 && i1 >= i3 && i1 >= i4) {
            System.out.println(i1);
        }

        else if (i2 >= i3 && i2 >= i4) {
            System.out.println(i2);

        }

        else if (i3 >= i4) {
            System.out.println(i3);
        }

        else {
            System.out.println(i4);
        }



    }
}
