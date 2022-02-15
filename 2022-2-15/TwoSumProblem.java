package com.coding.problems;

import java.util.HashMap;

public class TwoSumProblem {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> setOfNum = new HashMap<Integer, Integer>();
        int[] indices = new int[2];
        for (int index = 0; index < nums.length; index++){
            if (setOfNum.containsKey(target - nums[index])){
                indices[0] = setOfNum.get(target - nums[index]);
                indices[1] = index;
                return indices;    
            }
            else
                setOfNum.put(nums[index], index);
        }
        return indices;
    }
}
