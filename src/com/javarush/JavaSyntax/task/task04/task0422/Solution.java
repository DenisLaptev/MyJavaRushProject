package com.javarush.JavaSyntax.task.task04.task0422;

/* 
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        double age = Double.parseDouble(bufferedReader.readLine());

        if(age<18){
            System.out.println("Подрасти еще");
        }


    }
}
