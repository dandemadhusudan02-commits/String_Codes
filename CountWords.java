/**
 * Program Name: CountWords
 * Description: This program counts the number of words in a given string.
 *              The user can input sentences repeatedly, and the program
 *              will display the total number of words in each sentence.
 *              Typing 'stop' will terminate the program.
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow multiple inputs until the user types 'stop'
        while (true) {

            // Prompt the user to enter a sentence
            System.out.println("Enter a string (or type 'stop' to stop) >>  ");
            String s = sc.nextLine();  // Read the full line including spaces

            // Check if the user wants to exit the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                sc.close();  // Close the scanner to free resources
                break;       // Exit the loop
            }

            // Split the string into words using whitespace as a delimiter
            // "\\s+" means one or more spaces, tabs, or other whitespace characters
            String[] words = s.toLowerCase().split("\\s+");

            // Display the total number of words found in the string
            System.out.println("Word count is >> " + words.length);
        }
    }
}
