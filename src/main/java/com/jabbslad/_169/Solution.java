package com.jabbslad._169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int res = seen.compute(nums[i], (k, v) -> v == null ? 1 : v + 1);
            if (res > nums.length / 2)
                return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.majorityElement(new int[]{3, 2, 3});
        assert 3 == result;
    }
}
