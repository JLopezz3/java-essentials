package com.example.java;

import java.util.Scanner;

public class InputHelper {

    // remove private access modifier, so it can be called publicly.

     static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
