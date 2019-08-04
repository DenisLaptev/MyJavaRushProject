package com.javarush.JavaSyntax.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();

        int N = 10;

        for (int i = 0; i < N; i++) {
            System.out.println(name + " любит меня.");
        }

    }
}
