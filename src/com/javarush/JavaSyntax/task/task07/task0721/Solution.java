package com.javarush.JavaSyntax.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] intArray = new int[20];
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            intArray[i] = number;
        }
        maximum = intArray[0];
        minimum = intArray[0];

        for (int i = 0; i < 20; i++) {
            if (maximum < intArray[i]) {
                maximum = intArray[i];
            }
            if (minimum > intArray[i]) {
                minimum = intArray[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
