package com.jabbslad._202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int next(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            sum += d * d;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = next(n);
        }
        return n == 1;
    }
}
