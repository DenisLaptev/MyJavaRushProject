package com.javarush.JavaSyntax.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        int max_ab = max2(a,b);
        int max_cd = max2(c,d);
        int max_abcd = max2(max_ab,max_cd);

        System.out.println(max_abcd);

    }

    public static int max2(int a, int b){
        int resultMax = a;

        if (a >= b) {
            resultMax = a;
        } else {
            resultMax = b;
        }
        return resultMax;
    }
}
