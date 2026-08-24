package org.tnsif.acce.c2tc.collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Dragon Fruit");

        System.out.println(fruits);

        System.out.println("Second Fruit: " + fruits.get(1));

        fruits.set(1, "Cherry");

        System.out.println(fruits);

        fruits.remove(2);

        System.out.println("After removing " + fruits);

        if (fruits.contains("Mango")) {
            System.out.println("Requested fruit is present");
        } else {
            System.out.println("Requested fruit is not present");
        }

        // Using Iterable
        Iterable<String> iterableFruits = fruits;

        System.out.println("Traversing using Iterable: " + iterableFruits);

        // Using for-each loop
        for (String fruit : fruits) {
            System.out.println("Traversing using for-each loop: " + fruit);
        }
    }
}