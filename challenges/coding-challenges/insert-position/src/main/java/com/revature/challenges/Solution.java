package com.revature.challenges;

public class Solution {
    public int insertPosition(int[] nums, int target) {
        int index = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                index = i;
                return index;
            } else if(target > nums[i]) {
                index = i+1;
            } else if (target < nums[i]) {
                index = i-2;
            }
        }
        return index;
    }
}
