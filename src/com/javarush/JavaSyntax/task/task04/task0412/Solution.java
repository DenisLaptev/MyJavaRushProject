package com.javarush.JavaSyntax.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        int newNumber = 0;

        if (number > 0) {
            newNumber = number * 2;
        } else if (number < 0) {
            newNumber = number + 1;
        }

        System.out.println(newNumber);
    }

}