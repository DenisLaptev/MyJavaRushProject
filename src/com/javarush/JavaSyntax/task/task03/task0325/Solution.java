package com.javarush.JavaSyntax.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("Я буду зарабатывать $" + n + " в час");
        //System.out.println(1==1.0);
    }
}
