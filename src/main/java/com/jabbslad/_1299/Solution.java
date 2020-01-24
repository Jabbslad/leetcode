package com.jabbslad._1299;

public class Solution {
    public int[] replaceElements(int[] arr) {
        int curr, max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            curr = arr[i];
            arr[i] = max;
            max = Math.max(max, curr);
        }
        return arr;
    }
}
