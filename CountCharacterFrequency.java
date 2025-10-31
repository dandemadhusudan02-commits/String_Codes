/**
 * Program Name: CountCharacterFrequency
 * Description: This program counts the frequency of each character in a given string.
 *              It ignores spaces and displays how many times each character appears.
 *              The user can type 'stop' to terminate the program.
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.Scanner;

public class CountCharacterFrequency {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow multiple string checks until the user stops
        while (true) {

            // Prompt the user to enter a string
            System.out.println("Enter a String (or type 'stop' to stop) >> ");
            String s = sc.next();

            // If user enters "stop", end the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                break; // Exit the loop
            }

            // Array to store the frequency of each ASCII character (0–255)
            int[] chars = new int[256];

            // Loop through each character in the string
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i); // Get each character
                if (ch != ' ') {       // Ignore spaces
                    chars[ch]++;       // Increment count for that character
                }
            }

            // Display each character and its frequency
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] > 0) { // Print only characters that appeared
                    System.out.println((char) i + " >> " + chars[i]);
                }
            }
        }

        // Close the Scanner object to release system resources
        sc.close();
    }
}
