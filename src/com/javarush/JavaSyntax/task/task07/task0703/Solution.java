package com.javarush.JavaSyntax.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            stringArray[i] = bufferedReader.readLine();
        }

        for (int i = 0; i < 10; i++) {
            intArray[i] = stringArray[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(intArray[i]);
        }
    }
}
