package com.javarush.JavaSyntax.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }


        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        //напишите тут ваш код
        Set<Object> animals = new HashSet<>();
        animals.addAll(cats);
        animals.addAll(dogs);
        return animals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()) {
            Object pet = iterator.next();
            System.out.println(pet);
        }
    }

    //напишите тут ваш код
    public static class Cat {

    }

    public static class Dog {
        public Dog() {
        }
    }
}
