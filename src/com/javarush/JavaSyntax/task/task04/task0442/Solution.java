package com.javarush.JavaSyntax.task.task04.task0442;


/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double resultSum = 0.0;

        while (true) {
            double number = Double.parseDouble(bufferedReader.readLine());
            resultSum += number;
            if (number == -1) {
                break;
            }
        }
        System.out.println(resultSum);
    }
}
