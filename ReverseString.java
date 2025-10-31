/**
 * Program Name: ReverseString
 * Description: This program takes a string input from the user
 *              and prints the reversed version of that string.
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the String >> ");

        // Read the input string
        String s = sc.next();

        // Initialize an empty string to store the reversed string
        String rev = "";

        // Loop through the string from the last character to the first
        for (int i = s.length() - 1; i >= 0; i--) {
            // Append each character in reverse order
            rev += s.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed String: " + rev);

        // Close the scanner to free resources
        sc.close();
    }
}
