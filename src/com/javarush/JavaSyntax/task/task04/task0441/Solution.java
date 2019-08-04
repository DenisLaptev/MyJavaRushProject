package com.javarush.JavaSyntax.task.task04.task0441;


/* 
Как-то средненько
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

        if((a<=b && a>=c)||(a<=c && a>=b)) {
            System.out.println(a);
        }else if((b<=a && b>=c)||(b<=c && b>=a)) {
            System.out.println(b);
        }else if((c<=a && c>=b)||(c<=b && c>=a)) {
            System.out.println(c);
        }
    }
}
