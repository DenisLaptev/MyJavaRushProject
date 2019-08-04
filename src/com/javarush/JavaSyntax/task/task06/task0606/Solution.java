package com.javarush.JavaSyntax.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine();
        int numberOfDigits = number.length();
        char[] charDigits = number.toCharArray();

        for (int i = 0; i < numberOfDigits; i++) {
            int digit = charDigits[i];
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
