package com.coding.problems;

import java.util.HashSet;

public class ContainsDuplicateProblem {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int index = 0; index < nums.length; index++){
            if (numbers.contains(nums[index]))
                return true;
            else
                numbers.add(nums[index]);
        }
        return false;
    }
}
