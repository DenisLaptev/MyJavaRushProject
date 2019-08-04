package com.javarush.JavaSyntax.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        double age = Double.parseDouble(bufferedReader.readLine());

        if(age>20){
            System.out.println("И 18-ти достаточно");
        }
    }
}
