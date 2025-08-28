package com.zerkov.leetcode.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class TwoSumTest {
    @Test
    void testTwoSum() {
        TwoSum solution = new TwoSum();

        // Test case 1: nums = [2,7,11,15], target = 9, expected = [0,1]
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, solution.twoSum(nums1, target1), "Test case 1 failed");

        // Test case 2: nums = [3,2,4], target = 6, expected = [1,2]
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        assertArrayEquals(expected2, solution.twoSum(nums2, target2), "Test case 2 failed");

        // Test case 3: nums = [3,3], target = 6, expected = [0,1]
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, solution.twoSum(nums3, target3), "Test case 3 failed");

        // Edge case: Empty array
        int[] nums4 = {};
        int target4 = 0;
        int[] expected4 = {};
        assertArrayEquals(expected4, solution.twoSum(nums4, target4), "Empty array test failed");
    }
}