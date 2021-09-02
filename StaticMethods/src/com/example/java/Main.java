package com.example.java;

import java.util.Scanner;

public class Main {

    // STATIC METHOD = METHODS CAN BE CALLED DIRECTLY FROM THE CLASS, WITHOUT CREATING AN INSTANCE OF A CLASS
    // INSTANCE METHOD

    public static void main(String[] args) {

        String input = getInput("Enter value 1: ");
        System.out.println("You entered: " + input);
        input = getInput("Enter value 2: ");
        System.out.println("You entered: " + input);

    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
