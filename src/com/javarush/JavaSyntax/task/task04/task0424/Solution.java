package com.javarush.JavaSyntax.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        numbers[0] = Integer.parseInt(bufferedReader.readLine());
        numbers[1] = Integer.parseInt(bufferedReader.readLine());
        numbers[2] = Integer.parseInt(bufferedReader.readLine());

        if ((numbers[0] != numbers[1]) && (numbers[0] != numbers[2]) && (numbers[1] == numbers[2])) {
            System.out.println(1);
        } else if ((numbers[1] != numbers[0]) && (numbers[1] != numbers[2]) && (numbers[0] == numbers[2])) {
            System.out.println(2);
        } else if ((numbers[2] != numbers[0]) && (numbers[2] != numbers[1]) && (numbers[0] == numbers[1])) {
            System.out.println(3);
        }
    }
}
