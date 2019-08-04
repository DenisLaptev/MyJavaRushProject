package com.javarush.JavaSyntax.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        int N = Integer.parseInt(bufferedReader.readLine());

        int count = 1;
        while(count<=N){
            System.out.println(string);
            count++;
        }

    }
}
