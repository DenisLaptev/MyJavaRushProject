package com.javarush.JavaSyntax.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] intArray = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            intArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(intArray[9 - i]);
        }
    }
}

