package com.javarush.JavaSyntax.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int N = 0;
        double result = 0.0;

        while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number != -1) {
                sum += number;
                N++;
            } else if (N == 0) {
                result = 0;
                break;
            } else {
                result = (double) sum / (double) N;
                break;
            }
        }
        System.out.println(result);
    }
}

