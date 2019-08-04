package com.javarush.JavaSyntax.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Double[] numbers = new Double[3];
        numbers[0] = Double.parseDouble(bufferedReader.readLine());
        numbers[1] = Double.parseDouble(bufferedReader.readLine());
        numbers[2] = Double.parseDouble(bufferedReader.readLine());

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}
