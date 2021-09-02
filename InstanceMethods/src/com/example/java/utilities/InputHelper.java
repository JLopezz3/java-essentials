package com.example.java.utilities;

import java.util.Scanner;

public class InputHelper {

    //delete keyword static

    public String getInput(String prompt){
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
