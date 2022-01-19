package com.lucasmarques.leetcode;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Refer to <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Link</a>
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int count = 1;
        int lastIndex = 0;
        int lastNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num != lastNum) {
                lastNum = num;
                lastIndex++;
                nums[lastIndex] = lastNum;
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray algorithm = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(algorithm.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

}
