package com.javarush.JavaSyntax.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double minute = Double.parseDouble(bufferedReader.readLine());

        if(minute>60){
            minute %= 60;
        }

        double minuteInCycle = minute%5;
        if(minuteInCycle>=0 && minuteInCycle<3){
            System.out.println("зелёный");
        }else if(minuteInCycle>=3 && minuteInCycle<4){
            System.out.println("жёлтый");
        }else if(minuteInCycle>=4 && minuteInCycle<5){
            System.out.println("красный");
        }else{
            System.out.println("Error!");
        }
    }
}