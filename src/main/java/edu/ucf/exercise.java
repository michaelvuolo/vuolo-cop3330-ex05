/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // prompt for quote
        System.out.print("What is the quote? ");

        // create new scanner
        Scanner input = new Scanner(System.in);

        // read user's quote
        String quote = input.nextLine();

        // prompt for author
        System.out.print("Who said it? ");

        // read user's author
        String author = input.nextLine();

        // output
        System.out.print(author + " says, " + "\"" + quote + "\"");
    }
}
