package com.javarush.JavaSyntax.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        if(a>0 && b>0){
            System.out.println(1);
        }else if(a<0 && b>0){
            System.out.println(2);
        }else if(a<0 && b<0){
            System.out.println(3);
        }else if(a>0 && b<0){
            System.out.println(4);
        }
    }
}
