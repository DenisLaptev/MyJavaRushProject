package com.javarush.JavaSyntax.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer>numbersAllList = new ArrayList<>();
        ArrayList<Integer>numbers3List = new ArrayList<>();
        ArrayList<Integer>numbers2List = new ArrayList<>();
        ArrayList<Integer>numbersOtherList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            Integer number = Integer.parseInt(bufferedReader.readLine());
            numbersAllList.add(number);
        }
        for (int i = 0; i < 20; i++) {
            Integer currentNumber = numbersAllList.get(i);
            if(currentNumber %3 ==0){
                numbers3List.add(currentNumber);
            }
            if(currentNumber %2 ==0){
                numbers2List.add(currentNumber);
            }
            if(currentNumber %3 !=0 && currentNumber %2 !=0){
                numbersOtherList.add(currentNumber);
            }
        }

        printList(numbers3List);
        printList(numbers2List);
        printList(numbersOtherList);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer aList : list) {
            System.out.println(aList);
        }
    }
}
