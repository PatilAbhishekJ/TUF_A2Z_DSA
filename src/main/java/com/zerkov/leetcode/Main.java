package com.zerkov.leetcode;

import com.zerkov.leetcode.array.TwoSum;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Two Sum result: " + Arrays.toString(result));
    }

    public String reverseString(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

}