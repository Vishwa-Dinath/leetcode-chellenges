package com.leetcode.dvd;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
//        int[] nums = new int[]{2,7,11,15};
//        int[] nums = new int[]{3,2,4};
        int[] nums = new int[]{2,4,11,13};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int num1 = nums[i];
                int num2 = nums[j];
                if (num1 + num2 == target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }

        }
        return result;
    }
}
