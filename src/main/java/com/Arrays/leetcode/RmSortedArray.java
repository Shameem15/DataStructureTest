package com.Arrays.leetcode;

import java.util.Arrays;

public class RmSortedArray {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Result: " + removeDuplicates(nums)); //output = 5
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int temp = nums[0];
        for (int i=1; i < nums.length; i++) {
            if (temp != nums[i]) {
                nums[count] = nums[i];
                count++;
            }
            temp = nums[i];
        }

        return count;
    }
}
