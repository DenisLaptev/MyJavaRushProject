package com.javarush.JavaSyntax.task.task06.task0605;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            String result = "";

            double massIndex = 0.0;
            massIndex = weight / (height*height);

            if (massIndex < 18.5 ) {
                result = "Недовес: меньше чем 18.5";
            } else if (massIndex >= 18.5 && massIndex < 25) {
                result = "Нормальный: между 18.5 и 25";
            } else if (massIndex >= 25 && massIndex < 30) {
                result = "Избыточный вес: между 25 и 30";
            } else if (massIndex >= 30) {
                result = "Ожирение: 30 или больше";
            }
            System.out.println(result);
        }
    }
}
