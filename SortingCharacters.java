/**
 * Program Name: SortingCharacters
 * Description: This program takes a string input from the user and sorts its
 *              characters in descending order based on their frequency of occurrence.
 *              Characters that appear more frequently are placed first.
 *              The program continues to take input until the user types 'stop'.
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

public class SortingCharacters {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop to allow multiple string inputs until 'stop' is entered
        while (true) {

            // Prompt user to enter a string
            System.out.println("Enter a String (or type 'stop' to stop) >>  ");
            String s = sc.next();

            // Exit condition for program termination
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program Ended");
                sc.close();
                break;
            }

            // Create a HashMap to store frequency of each character
            Map<Character, Integer> freqMap = new HashMap<>();

            // Count frequency of each character in the input string
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }

            // Convert the frequency map into a list of entries for sorting
            List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());

            // Sort characters by frequency in descending order
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

                @Override
                public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue()); // Descending order
                }
            });

            // Build the new sorted string based on character frequency
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < list.size(); i++) {
                Map.Entry<Character, Integer> entry = list.get(i);
                char ch = entry.getKey();
                int count = entry.getValue();

                // Append the character multiple times based on its frequency
                for (int j = 0; j < count; j++) {
                    sb.append(ch);
                }
            }

            // Display results
            System.out.println("Original String is >> " + s);
            System.out.println("Sorted String by Frequency of Characters >> " + sb.toString().trim());
        }
    }
}
