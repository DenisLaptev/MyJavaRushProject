package com.javarush.JavaSyntax.task.task04.task0434;


/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int N = 10;

        int count = 1;
        while (count <= N) {
            int innerCount = 1;
            while (innerCount <= N) {
                System.out.print(count*innerCount+ " ");
                innerCount++;
            }
            System.out.println("\r");
            count++;
        }
    }
}
