package com.jabbslad._198;

public class Solution {

    public int rob(int[] nums) {
        int prev = 0;
        int curr = 0;

        for (int x : nums) {
            int t = curr;
            curr = Math.max(prev + x, curr);
            prev = t;
        }
        return curr;
    }

    public static void main(String... args) {
        Solution solution = new Solution();
        int result = solution.rob(new int[]{1, 2, 3, 1});
        assert result == 4;
    }
}
