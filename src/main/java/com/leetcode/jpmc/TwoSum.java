package com.leetcode.jpmc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int nums[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int targetValue = 15;

		TwoSum twoSum = new TwoSum();
		twoSum.sumOfValue(nums, targetValue);

	}

	public void sumOfValue(int[] nums, int targetValue) {
		System.out.println("Given Array :: " + Arrays.toString(nums));
		System.out.println("Target Value :: " + targetValue);

		Map<Integer, Integer> map = new HashMap<>();

		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int x = targetValue - nums[i];

			if (map.containsKey(x)) {
				result[0] = i;
				result[1] = map.get(x);
				System.out.println("[" + result[0] + "," + result[1] + "]");
			}
			map.put(nums[i], i);
		}
	}
}
