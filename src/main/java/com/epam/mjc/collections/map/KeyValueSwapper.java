package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        sourceMap.forEach((k, v) -> {
            if(result.containsKey(v)) {
                int min = Integer.min(k, result.get(v));
                result.computeIfPresent(v, (a, b) -> min);
            } else {
                result.put(v, k);
            }
            result.put(v, k);
        });
        return result;
    }
}
