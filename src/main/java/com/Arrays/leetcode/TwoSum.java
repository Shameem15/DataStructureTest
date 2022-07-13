package com.Arrays.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int target = 9;
        int[] nums = {2,7,11,15};

        int[] resultIndexs = twoSum(nums, target);
        System.out.println("resultIndexs: " + Arrays.toString(resultIndexs));

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] resultIndexs = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i<nums.length; i++) {

            if(map.containsKey(target-nums[i])) {
                resultIndexs[0] = map.get(target-nums[i]);
                resultIndexs[1] = i;
                return resultIndexs;
            } else {
                map.put(nums[i], i);
            }
        }
        return resultIndexs;
    }
}
