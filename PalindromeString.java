/**
 * Program Name: PalindromeString
 * Description: This program accepts a string input from the user and checks
 *              whether the entered string is a palindrome or not.
 *              A palindrome is a string that reads the same backward as forward.
 *              The user can type "stop" to terminate the program.
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to repeatedly take input until user types "stop"
        while (true) {

            // Prompt the user to enter a string or stop the program
            System.out.println("Enter the String (or type 'stop' to stop) >> ");
            String s = sc.next();  // Reads a single word input

            // Check if user wants to end the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                break;  // Exit the loop
            }

            // Initialize an empty string to store the reversed version
            String rev = "";

            // Reverse the string manually using a loop
            for (int i = s.length() - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }

            // Compare the original and reversed strings (case-insensitive)
            if (s.equalsIgnoreCase(rev)) {
                System.out.println("String is Palindrome");
            } else {
                System.out.println("String is not Palindrome");
            }
        }

        // Close the Scanner object to free up resources
        sc.close();
    }
}
