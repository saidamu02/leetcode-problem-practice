package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = new int[] { 3, 2, 2, 3 };
		int val = 3;
		ArrayList<Integer> valueList = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				valueList.add(Integer.valueOf(nums[i]));
			}
		}
		System.out.println("List ::" + Arrays.toString(valueList.toArray()));
		System.out.println("Result ::" + valueList.size());
	}
}
