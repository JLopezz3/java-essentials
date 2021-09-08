package com.example.java;

import com.example.java.model.ClothingItem;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] ints = {3, 6, 9};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array of strings");
        String[] colors = {"Red", "Green", "Blue"};
        for (String color :
                colors) {
            System.out.println(color);
        }

        ClothingItem[] items = new ClothingItem[3];
        items[0] = new ClothingItem("Shirt", "L", 15);
        items[1] = new ClothingItem("Pants", "32", 20);
        items[2] = new ClothingItem("Hat", "M", 8);

        for (ClothingItem item :
                items) {
            System.out.println(item);
        }


    }
}
