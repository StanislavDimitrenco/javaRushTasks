package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());


        if (x > y && x > z && y>z) System.out.println(x + " " + y + " " + z);
        else if (x > y && x > z && z>y) System.out.println(x + " " + z + " " + y);
        else if (y > z && x>z) System.out.println(y + " " + x + " " + z);
        else if (y > z && z>x) System.out.println(y + " " + z + " " + x);
        else if (x>y) System.out.println(z + " " + x + " " + y);
        else System.out.println(z + " " + y + " " + x);



    }
}
