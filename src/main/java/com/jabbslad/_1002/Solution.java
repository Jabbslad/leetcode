package com.jabbslad._1002;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> commonChars(String[] A) {
        LinkedList<String> result = new LinkedList<>();
        if (A.length == 0)
            return result;

        Map<Character, Integer> counts = new HashMap<>();

        for (char c : A[0].toCharArray()) {
            counts.compute(c, (k, v) -> (v == null) ? 1 : v + 1);
        }

        for (int i = 1; i < A.length; i++) {
            for (char c : A[i].toCharArray()) {
                counts.computeIfPresent(c, (k, v) -> k == null ? 1 : v + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (A.length == entry.getValue()) {
                for (int i = 0; i < entry.getValue(); i++) {
                    result.add("" + entry.getKey());
                }
            }
        }
        return result;
    }
}
