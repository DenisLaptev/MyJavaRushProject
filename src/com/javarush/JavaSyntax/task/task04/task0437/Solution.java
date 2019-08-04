package com.javarush.JavaSyntax.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int triangleSize = 10;
        for (int i = 1; i <= triangleSize; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
