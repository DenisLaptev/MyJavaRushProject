package com.javarush.JavaSyntax.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        //int intNumbersArraySize = 20;
        //int[] intNumbersArray = new int[intNumbersArraySize];
        int[] intNumbersArray = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //for (int i = 0; i < intNumbersArraySize; i++) {
        for (int i = 0; i < 20; i++) {
            intNumbersArray[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return intNumbersArray;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
