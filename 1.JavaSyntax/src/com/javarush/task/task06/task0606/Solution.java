package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int sl = s.length();
        int num = Integer.parseInt(s);

        if(num < 0) {
            num = num * -1;
        }

        int [] arr = new int[sl];

        for(int x = 0; num > 0; num = num/10, x++ ) {

            arr[x] = num%10;
        }

        int x = 0;

        while (x<sl) {

            int y = arr[x]%2 == 0 ? even++ : odd++;
            x++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
