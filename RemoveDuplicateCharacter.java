/**
 * Program Name: RemoveDuplicateCharacter
 * Description: This program takes a string input from the user and removes all duplicate characters,
 *              printing only the unique characters (those that appear exactly once).
 *              The program continues to run until the user types "stop".
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.Scanner;

public class RemoveDuplicateCharacter {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow multiple inputs until the user chooses to stop
        while (true) {

            // Ask user to enter a string
            System.out.println("Enter a String (or type 'stop' to stop ) >>  ");
            String s = sc.next().toLowerCase(); // Convert to lowercase to ignore case differences

            // If user types "stop", exit the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                sc.close(); // Close scanner to release resources
                break;
            }

         // Array to store if a character is already seen (ASCII-based)
            boolean[] seen = new boolean[250];

            System.out.print("After Removing Duplicate Characters >> ");
            
         // Traditional loop to print only the first occurrence of each character
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                
             // If the character is seen for the first time, print and mark as seen
                if (!seen[ch]) { 
                    System.out.println(ch+ " ");
                    seen[ch]=true;
                }
            }

            System.out.println(); // For neat output formatting
        }
    }
}
