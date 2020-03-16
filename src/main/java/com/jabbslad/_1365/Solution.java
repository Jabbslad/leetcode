package com.jabbslad._1365;

public class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];
        for(int i=0; i<nums.length; i++) {
            counts[nums[i]]++;
        }

        int prev = 0;
        for(int i=0; i<counts.length; i++) {
            int curr = counts[i];
            counts[i] = prev;
            prev += curr;
        }

        for(int i=0; i<nums.length; i++) {
            nums[i] = counts[nums[i]];
        }
        return nums;
    }
}
