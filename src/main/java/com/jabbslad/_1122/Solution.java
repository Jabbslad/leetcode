package com.jabbslad._1122;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] counts = new int[1001];
        for (int x : arr1)
            counts[x]++;

        int i = 0;
        for (int x : arr2) {
            while (counts[x] > 0) {
                arr1[i++] = x;
                counts[x]--;
            }
        }

        for (int j = 0; j < counts.length; j++) {
            while (counts[j] > 0) {
                arr1[i++] = j;
                counts[j]--;
            }
        }
        return arr1;
    }
}
