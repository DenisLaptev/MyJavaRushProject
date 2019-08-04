package com.javarush.JavaSyntax.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        //Date dateAL1 = new Date();
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);
        //Date dateAL2 = new Date();


        //Date dateLL1 = new Date();
        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
        //Date dateLL2 = new Date();

        //System.out.println("deltaAL="+(dateAL2.getTime()-dateAL1.getTime()));
        //System.out.println("deltaLL="+(dateLL2.getTime()-dateLL1.getTime()));
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.add(1);
        }

    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.set(i, 2);
        }

    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
    }
}
