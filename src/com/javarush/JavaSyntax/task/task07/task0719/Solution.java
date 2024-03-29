package com.javarush.JavaSyntax.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer integer = Integer.parseInt(reader.readLine());
            integerList.add(integer);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(integerList.get(9 - i));
        }
    }
}
