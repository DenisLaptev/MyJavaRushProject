package com.javarush.JavaSyntax.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());


        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int max = numbers[0];
        for (int i = 0; i < N; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);

    }
}
