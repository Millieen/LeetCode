package com.millieen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> recordMap = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        int index = 0;
        for(int curnum : nums) {
            if(recordMap.containsKey(curnum)) {
                result[0] = recordMap.get(curnum);
                result[1] = index;
                return result;
            } else {
                recordMap.put(target-curnum, index);
            }
            index ++;
        }
        return result;
    }
}
