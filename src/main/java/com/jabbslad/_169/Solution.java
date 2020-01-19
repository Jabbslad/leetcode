package com.jabbslad._169;

public class Solution {
    public int majorityElement(int[] nums) {
        // Boyer-Moore Voting Algorithm
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0)
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.majorityElement(new int[]{3, 2, 3});
        assert 3 == result;
    }
}
