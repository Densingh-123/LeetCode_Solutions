package com.java.LeetCode_Solutions;
import java.util.Scanner;

public class Palindrome_Number {
    
    // Solution class to check if the number is a palindrome
    static class Solution {
        
        public boolean isPalindrome(int x) {
            // Edge case: negative numbers are not palindromes
            if (x < 0) {
                return false;
            }
            
            int original = x; // Store the original number
            int reversed = 0; // Variable to store the reversed number
            
            while (x > 0) {
                int digit = x % 10;  // Get the last digit
                reversed = reversed * 10 + digit;  // Build the reversed number
                x = x / 10;  // Remove the last digit
            }
            
            // Compare original number with reversed number
            return original == reversed;
        }
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Take input number from user
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        // Create an instance of Solution class
        Solution solution = new Solution();
        
        // Call isPalindrome method and print the result
        if (solution.isPalindrome(x)) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}
