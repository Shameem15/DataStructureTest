package com.Arrays.leetcode;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println("out: " + removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int num: nums) {

            if(num != val) {
                nums[count] = num;
                count++;
            }
        }
        return count;
    }
}
