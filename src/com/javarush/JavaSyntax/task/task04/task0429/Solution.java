package com.javarush.JavaSyntax.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int countNegativeNumbers = 0;
        int countPositiveNumbers = 0;

        if (a > 0) {
            countPositiveNumbers++;
        } else if (a < 0) {
            countNegativeNumbers++;
        }

        if (b > 0) {
            countPositiveNumbers++;
        } else if (b < 0) {
            countNegativeNumbers++;
        }

        if (c > 0) {
            countPositiveNumbers++;
        } else if (c < 0) {
            countNegativeNumbers++;
        }


        System.out.println("количество отрицательных чисел: " + countNegativeNumbers);
        System.out.println("количество положительных чисел: " + countPositiveNumbers);

    }
}
