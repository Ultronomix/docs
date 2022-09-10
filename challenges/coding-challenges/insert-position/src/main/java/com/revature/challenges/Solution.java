package com.revature.challenges;

import java.util.Arrays;

public class Solution {

    public int insertPosition(int[] nums, int target) {
        int index = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            index = i;
            if(target == nums[i] || target < nums[i]) {
                break;
            }
            if(target > nums[nums.length-1]) {
                index = nums.length;
                break;
            }

            // index++;
        }

        return index;
    }
}
