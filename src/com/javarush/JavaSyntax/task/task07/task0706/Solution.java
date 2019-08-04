package com.javarush.JavaSyntax.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] intArray = new int[15];

        int sumOdd = 0;//нечётные
        int sumEven = 0;//чётные

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            intArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                sumEven+=intArray[i];
            } else {
                sumOdd+=intArray[i];
            }
        }

        if (sumEven > sumOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        if (sumEven < sumOdd) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
