package com.javarush.JavaSyntax.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /*
    високосным годом (366 суток) является год,
    который делится без остатка на 4 за исключением годов,
    которые кратны 100 и не кратны 400.
    */
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());

        boolean isVys = false;


        if (year % 4 == 0) {
            if((year % 100 == 0) && (year % 400 != 0)){
                isVys = false;
            }else{
                isVys = true;
            }
        }else{
            isVys = false;
        }

        if(isVys == false){
            System.out.println("количество дней в году: 365");
        }else{
            System.out.println("количество дней в году: 366");
        }

    }
}