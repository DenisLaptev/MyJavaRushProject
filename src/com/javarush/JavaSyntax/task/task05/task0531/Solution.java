package com.javarush.JavaSyntax.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {
        int min_ab = min(a, b);
        int min_cd = min(c, d);
        int min_abcd = min(min_ab, min_cd);
        int min = min(min_abcd, e);
        return min;
    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
