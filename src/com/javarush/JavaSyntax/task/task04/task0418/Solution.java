package com.javarush.JavaSyntax.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        if (a <= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}