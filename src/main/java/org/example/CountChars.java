/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sebastian Steele
 */

package org.example;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        // Let's grab a string
        Scanner getName = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String strtocount = getName.nextLine();

        // output contains string, and uses built in function.
        // adding a comment to just create a new commit
        System.out.println(strtocount + " has " + strtocount.length() +" characters.");
    }

}
