package com.jabbslad._191;

public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String... args) {
        Solution solution = new Solution();
        int result = solution.hammingWeight(11);
        assert result == 3;
    }
}
