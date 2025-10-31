/**
 * Program Name: LongestWord
 * Description: This program takes a sentence input from the user and finds the longest word(s) in it.
 *              If multiple words have the same maximum length, it displays all of them.
 *              The program continues to accept input until the user types "stop".
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to repeatedly take input from the user
        while (true) {

            // Prompt the user to enter a string
            System.out.println("Enter a Sentence (or type 'stop' to stop ) >> ");
            String s = sc.nextLine();

            // If the user types 'stop', end the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                sc.close(); // Close the scanner to free system resources
                break; // Exit the loop
            }

            // Initialize variable to store the longest word
            String longest = " ";

            // Split the input string into words based on spaces
            String[] words = s.toLowerCase().split(" ");

            // Find the longest word by comparing lengths
            for (String word : words) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            // Display all words that have the same length as the longest word
            for (String w : words) {
                if (w.length() == longest.length()) {
                    System.out.println("Longest word in string is >> " + w);
                }
            }
        }
    }
}
