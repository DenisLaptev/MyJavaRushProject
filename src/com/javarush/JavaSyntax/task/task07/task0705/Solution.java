package com.javarush.JavaSyntax.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] intArray = new int[20];

        int[] intSmallArray1 = new int[10];
        int[] intSmallArray2 = new int[10];


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            intArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            intSmallArray1[i] = intArray[i];
        }

        for (int i = 0; i < 10; i++) {
            intSmallArray2[i] = intArray[i+10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(intSmallArray2[i]);
        }
    }
}
