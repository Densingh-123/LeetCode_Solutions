package com.java.LeetCode_Solutions;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
// 
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
//Constraints:
//
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Only one valid answer exists.
// 
//
//Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
public class TwoSum {

    // Method to find two indices whose values sum to the target
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int length = nums.length;
        
        // Loop through the array
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                // Check if the two numbers add up to the target
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr; // Return immediately once the pair is found
                }
            }
        }
        
        // Return empty array if no solution is found (though it's guaranteed to have a solution)
        return arr;
    }

    // Main method to test the function
    public static void main(String[] args) {
        TwoSum solution = new TwoSum(); // Create an object of TwoSum
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
