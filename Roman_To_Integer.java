package com.java.LeetCode_Solutions;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Roman_To_Integer {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a Roman numeral
        System.out.print("Enter a Roman Letter to convert it to Integer: ");
        String str = sc.next();
        
        // Map to store Roman numeral characters and their corresponding integer values
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        // Initialize result with the value of the last character in the string
        int result = hm.get(str.charAt(str.length() - 1));

        // Loop through the string from second last character to the first
        for (int i = str.length() - 2; i >= 0; i--) {
            // If current value is less than the next value, subtract it
            if (hm.get(str.charAt(i)) < hm.get(str.charAt(i + 1))) {
                result -= hm.get(str.charAt(i));
            } else {
                // Otherwise, add the current value
                result += hm.get(str.charAt(i));
            }
        }

        // Output the result (converted integer value)
        System.out.println("The integer value of the Roman numeral " + str + " is: " + result);
        
        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
