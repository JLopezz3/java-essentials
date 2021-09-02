package com.example.java;

import com.example.java.utilities.InputHelper;

public class Main {

    public static void main(String[] args) {

        //since it is not static, need to instantiate the object first.
        InputHelper helper = new InputHelper();


        String input = helper.getInput("Enter value 1: ");
        System.out.println("You entered: " + input);
        input = helper.getInput("Enter value 2: ");
        System.out.println("You entered: " + input);

    }
}
