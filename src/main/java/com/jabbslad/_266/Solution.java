package com.jabbslad._266;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            int ret = chars.compute(c, (k, v) -> (v == null) ? 1 : v + 1);
            if (ret % 2 == 0) {
                count--;
            } else {
                count++;
            }
        }
        return count <= 1;
    }
}
