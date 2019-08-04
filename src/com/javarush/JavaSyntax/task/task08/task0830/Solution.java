package com.javarush.JavaSyntax.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        for (int out = array.length - 1; out >= 1; out--) {  //Внешний цикл
            for (int in = 0; in < out; in++) {       //Внутренний цикл
                //Если порядок элементов нарушен
                if (isGreaterThan(array[in], array[in + 1])) {               //Если порядок элементов нарушен
                    //вызвать метод, меняющий местами
                    String tmp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = tmp;

                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
