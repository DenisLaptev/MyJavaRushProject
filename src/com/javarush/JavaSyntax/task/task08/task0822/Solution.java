package com.javarush.JavaSyntax.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int min = array.get(0);
        for (Integer integer : array) {
            if (min > integer) {
                min = integer;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        List<Integer> integerList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            integerList.add(number);
        }
        return integerList;
    }
}
