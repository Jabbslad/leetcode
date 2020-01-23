package com.jabbslad._1122;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        LinkedHashMap<Integer, Integer> counts = new LinkedHashMap<>();
        for (int x : arr1)
            counts.compute(x, (k, v) -> v == null ? 0 : v + 1);

        int i = 0;
        for (int x : arr2) {
            int v = counts.remove(x);
            for(int j = 0; j<v; j++)
                arr1[i++] = v;
        }

        for(Map.Entry<Integer, Integer> pair : counts.entrySet()) {
            for(int j = 0; j<pair.getValue(); j++)
                arr1[i++] = pair.getValue();
        }
        return arr1;
    }
}
