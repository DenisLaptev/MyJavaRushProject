package com.javarush.JavaSyntax.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int y = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Меня зовут " + name + ".\n" +
                "Я родился " + d + "." + m + "." + y);
    }
}