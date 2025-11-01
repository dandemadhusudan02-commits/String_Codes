/**
 * Program Name: RemoveDuplicateWords
 * Description: This program accepts a sentence from the user and identifies
 *              unique words by counting their frequency. It prints all words
 *              that appear only once in the input sentence. The program keeps
 *              running until the user types 'stop'.
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This class demonstrates how to remove duplicate words from a sentence
 * entered by the user using a HashMap for word frequency counting.
 */
public class RemoveDuplicateWords {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Run the loop continuously until the user chooses to stop
        while (true) {

            // Ask the user to input a sentence
            System.out.println("Enter a Sentence (or type 'stop' to stop) >>  ");
            String s = sc.nextLine();

            // Split the input sentence into words and convert them to lowercase
            String[] words = s.toLowerCase().split("\\s+");

            // Check if the user wants to stop the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                sc.close(); // Close scanner to release resources
                break;
            }

            // Create a HashMap to store each word and its count
            Map<String, Integer> countWords = new HashMap<>();

            // Count frequency of each word in the sentence
            for (String word : words) {
                countWords.put(word, countWords.getOrDefault(word, 0) + 1);
            }

            // Display the result after removing duplicate words
            System.out.println("After Removing Duplicate Words >> ");
            for (Map.Entry<String, Integer> entry : countWords.entrySet()) {

                // (Note: This condition checks for any word count equal to 1)
                if (countWords.containsValue(1)) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}
