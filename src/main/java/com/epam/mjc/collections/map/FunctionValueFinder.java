package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        if(functionMap.containsKey(requiredValue) || functionMap.containsValue(requiredValue))
            return true;
        else
            return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();
        for (int i = 0; i < sourceList.size(); i++) {
            functionMap.put(sourceList.get(i), sourceList.get(i) * 5 + 2);
        }
        return functionMap;
    }
}
