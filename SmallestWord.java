/**
 * Program Name: SmallestWord
 * Description: This program takes a sentence as input from the user and finds 
 *              the smallest word (word with the least number of characters). 
 *              If multiple words have the same smallest length, it displays all of them.
 *              The program keeps running until the user types "stop".
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.Scanner;

public class SmallestWord {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to continuously take input until user types 'stop'
        while (true) {

            // Prompt the user for a string
            System.out.println("Enter a string (or type 'stop' to stop) >> ");
            String s = sc.nextLine();

            // Stop the program if the user enters 'stop'
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                sc.close(); // Close scanner to release resources
                break;
            }

            // Convert string to lowercase and split into words
            String[] words = s.toLowerCase().split(" ");

            // Assume the first word is the smallest initially
            String smallest = words[0];

            // Find the smallest word by comparing lengths
            for (String word : words) {
                if (word.length() < smallest.length()) {
                    smallest = word;
                }
            }

            // Print all words that have the same length as the smallest word
            for (String w : words) {
                if (w.length() == smallest.length()) {
                    System.out.println("Smallest word in string is >> " + w);
                }
            }
        }
    }
}
