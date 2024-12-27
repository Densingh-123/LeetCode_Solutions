package com.java.LeetCode_Solutions;

import java.util.Stack;

public class Valid_Parentheses {
    // Class to check for valid parentheses
    public class Solution {
        public boolean isValid(String s) {
            // Create a stack to store opening brackets
            Stack<Character> stack = new Stack<>();
        
            // Iterate through each character in the string
            for (char c : s.toCharArray()) {
                // If it's an opening bracket, push it onto the stack
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                }
                // If it's a closing bracket, check if it matches the top of the stack
                else {
                    // If stack is empty or the brackets don't match, return false
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                        return false;
                    }
                }
            }
        
            // If the stack is empty, all brackets matched correctly
            return stack.isEmpty();
        }
    }
    
    public static void main(String[] args) {
        // Create an instance of the Solution class and test the function
        Solution solution = new Valid_Parentheses().new Solution();
        
        // Test cases
        System.out.println(solution.isValid("()"));       // true
        System.out.println(solution.isValid("()[]{}"));   // true
        System.out.println(solution.isValid("(]"));       // false
        System.out.println(solution.isValid("([)]"));     // false
        System.out.println(solution.isValid("{[]}"));     // true
    }
}
