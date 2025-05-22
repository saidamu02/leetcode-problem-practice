package com.leetcode.medium;

import java.util.Arrays;

public class SortColor {
	public static void main(String[] args) {
		int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
		System.out.println("Before Sort ::" + Arrays.toString(nums));
		
		int low = 0, mid = 0, high = nums.length - 1;
		while (mid <= high) {
			if (nums[mid] == 0) {
				// Swap nums[low] and nums[mid]
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else { // nums[mid] == 2
				// Swap nums[mid] and nums[high]
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
			}
		}
		System.out.println("After Sort ::" + Arrays.toString(nums));
	}
}
