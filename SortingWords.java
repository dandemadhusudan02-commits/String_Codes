/**
 * Program Name: SortingWords
 * Description: This program accepts a sentence from the user and sorts its words
 *              based on their frequency in descending order. Words that appear
 *              more frequently are placed first. The program continues to take input
 *              until the user types 'stop'.
 * Author: Madhusudan Dande
 */

package com.string.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortingWords {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to repeatedly take user input until 'stop' is entered
        while (true) {

            // Prompt user to enter a sentence
            System.out.println("Enter a sentence (or type 'stop' to stop) >>   ");
            String s = sc.nextLine();

            // Split the input sentence into words using whitespace as a separator
            String[] words = s.toLowerCase().split("\\s+");

            // Exit condition: if the user types 'stop', close the scanner and end the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                sc.close();
                break;
            }

            // Create a HashMap to store each word and its frequency
            Map<String, Integer> freqMap = new HashMap<>();

            // Count the frequency of each word in the sentence
            for (String word : words) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }

            // Convert the frequency map to a list for sorting
            List<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());

            // Sort words based on their frequency in descending order
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

                @Override
                public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                    // Compare by frequency (descending order)
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            // StringBuilder to reconstruct the sentence after sorting
            StringBuilder sb = new StringBuilder();

            // Build the new sentence by repeating words based on their frequency
            for (int i = 0; i < list.size(); i++) {
                Map.Entry<String, Integer> entry = list.get(i);
                String ss = entry.getKey();
                int count = entry.getValue();

                // Append each word according to its frequency count
                for (int j = 0; j < count; j++) {
                    sb.append(ss).append(" ");
                }
            }

            // Display the original and sorted sentences
            System.out.println("Original Sentence is >> " + s);
            System.out.println("Sorted Sentence by Frequency of word >> " + sb.toString().trim());
        }
    }
}
