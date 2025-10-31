/**
 * Program Name: FirstNonRepeatingCharacter
 * Description: This program reads a string from the user and finds the first 
 *              non-repeating character in it. It continues to accept input 
 *              until the user types "stop". The program ignores case differences 
 *              (i.e., 'A' and 'a' are treated as the same character).
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to continuously take string inputs from the user
        while (true) {

            // Prompt user to enter a string
            System.out.println("Enter a String (or type 'stop' to stop) >> ");
            String s = sc.next();

            // If user types "stop", exit the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                sc.close(); // Close scanner to free resources
                break; // Exit loop
            }

            // Convert string to lowercase and character array
            char[] chars = s.toLowerCase().toCharArray();

            // Use LinkedHashMap to maintain insertion order of characters
            Map<Character, Integer> countChar = new LinkedHashMap<>();

            // Count frequency of each character
            for (char c : chars) {
                countChar.put(c, countChar.getOrDefault(c, 0) + 1);
            }

            // Find and print the first non-repeating character
            boolean found = false;
            for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println("First Non-Repeating Character is >> " + entry.getKey());
                    found = true;
                    break;
                }
            }

            // If no non-repeating character is found, display message
            if (!found) {
                System.out.println("No Non-Repeating Character Found");
            }
        }
    }
}
