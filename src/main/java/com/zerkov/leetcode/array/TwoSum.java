package com.zerkov.leetcode.array;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store number-to-index mappings
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Add current number and its index to the map
            map.put(nums[i], i);
        }

        // No solution found
        return new int[] {};
    }
}