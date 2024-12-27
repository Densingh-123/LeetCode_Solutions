package com.java.LeetCode_Solutions;
import java.util.Arrays;

public class Longest_Common_Prefix {

    // Method to find the longest common prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array
        Arrays.sort(strs);

        // Compare the first and last strings after sorting
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;

        // Compare the characters of the first and last strings
        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        // Return the common prefix
        return str1.substring(0, index);
    }

    public static void main(String[] args) {
        // Example input
        String[] strs = {"flower", "flow", "flight"};

        // Call the method to find the longest common prefix
        String result = longestCommonPrefix(strs);

        // Print the result
        System.out.println(result);  // Output: "fl"
    }
}
