package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        String[] parsed = sentence
                .toLowerCase()
                .replace(".", "")
                .replace(",", "")
                .split(" ");
        for (int i = 0; i < parsed.length; i++) {
            if(result.containsKey(parsed[i])) {
                result.computeIfPresent(parsed[i], (k, v) -> v + 1);
            } else if (!parsed[i].equals("")) {
                result.put(parsed[i], 1);
            }
        }
        return result;
    }
}
