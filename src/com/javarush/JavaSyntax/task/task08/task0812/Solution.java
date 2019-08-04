package com.javarush.JavaSyntax.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int previousNumber = 0;
        int currentNumber = 0;

        int sequenceLength = 0;
        List<Integer> lengthsList = new ArrayList<>();

        List<Integer> intNumbersList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            intNumbersList.add(number);
        }

        previousNumber = intNumbersList.get(0);
        currentNumber = intNumbersList.get(1);

        for (int i = 0; i < 10; i++) {
            currentNumber = intNumbersList.get(i);
            if (currentNumber == previousNumber) {
                sequenceLength++;
            } else {
                lengthsList.add(sequenceLength);
                sequenceLength = 1;
            }

            previousNumber = currentNumber;
            if (i == intNumbersList.size() - 1) {
                lengthsList.add(sequenceLength);
            }
        }

        //System.out.println(lengthsList);

        int maxLength = 1;
        for (Integer currentLength : lengthsList) {
            if (maxLength < currentLength) {
                maxLength = currentLength;
            }
        }
        System.out.println(maxLength);

    }
}