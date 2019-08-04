package com.javarush.JavaSyntax.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int money;
        int years;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Enter name:");
        name = br.readLine();

        //System.out.println("Enter money:");
        money = Integer.parseInt(br.readLine());

        //System.out.println("Enter years:");
        years = Integer.parseInt(br.readLine());

        System.out.println(name + " получает " + money + " через " + years + " лет.");

    }
}
