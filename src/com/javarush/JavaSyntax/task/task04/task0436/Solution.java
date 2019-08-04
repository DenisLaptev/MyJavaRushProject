package com.javarush.JavaSyntax.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(bufferedReader.readLine());
        int cols = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
