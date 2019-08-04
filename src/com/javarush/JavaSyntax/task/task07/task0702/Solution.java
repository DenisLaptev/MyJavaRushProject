package com.javarush.JavaSyntax.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringArray = new String[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            stringArray[i] = bufferedReader.readLine();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(stringArray[9-i]);
        }
    }
}