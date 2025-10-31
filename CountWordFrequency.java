/**
 * Program Name: CountWordFrequency
 * Description: This program counts the frequency of each word in a given string.
 *              It ignores case differences and displays how many times each word appears.
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a String (or type 'stop' to stop) >> ");
        String s = sc.nextLine();

        // If user types 'stop', end the program
        if (s.equalsIgnoreCase("stop")) {
            System.out.println("Program Ended");
            sc.close();
            return;
        }

        // Convert to lowercase and split words by spaces
        String[] words = s.toLowerCase().split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> countWords = new HashMap<>();

        // Loop through each word
        for (String word : words) {
            // Increment word count; add new words if not present
            countWords.put(word, countWords.getOrDefault(word, 0) + 1);
        }

        // Display each word with its frequency
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            System.out.println(entry.getKey() + " >> " + entry.getValue());
        }

        sc.close();
    }
}
