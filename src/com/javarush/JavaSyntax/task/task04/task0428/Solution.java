package com.javarush.JavaSyntax.task.task04.task0428;

/* 
Положительное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int countPositiveNumbers = 0;
        if (a > 0) {
            countPositiveNumbers++;
        }
        if (b > 0) {
            countPositiveNumbers++;
        }
        if (c > 0) {
            countPositiveNumbers++;
        }
        System.out.println(countPositiveNumbers);
    }
}
