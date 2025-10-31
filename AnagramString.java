/**
 * Program Name: AnagramString
 * Description: This program checks whether two input strings are anagrams or not.
 *              Two strings are considered anagrams if they contain the same characters 
 *              with the same frequency, but possibly in a different order.
 *              The program ignores case differences (e.g., "Listen" and "Silent" are anagrams).
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow multiple checks until user stops the program
        while (true) {

            // Prompt user to enter the first string
            System.out.println("Enter a First String >> ");
            String s = sc.next();

            // Prompt user to enter the second string
            System.out.println("Enter a Second String (or enter 'stop' to stop) >> ");
            String s1 = sc.next();

            // If user enters "stop", end the program
            if (s1.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                break; // Exit from while loop
            }

            // Convert both strings to lowercase to make comparison case-insensitive
            s = s.toLowerCase();
            s1 = s1.toLowerCase();

            // Convert both strings into character arrays
            char[] ar1 = s.toCharArray();
            char[] ar2 = s1.toCharArray();

            // Sort both character arrays to easily compare them
            Arrays.sort(ar1);
            Arrays.sort(ar2);

            // Compare sorted arrays to check if both strings are anagrams
            System.out.println(Arrays.equals(ar1, ar2) ? "Anagram" : "Not Anagram");
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}
