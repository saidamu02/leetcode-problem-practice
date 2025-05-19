package com.leetcode.easy;

public class SearchInsert {
	public static void main(String[] args) {

		int[] nums = new int[] { 2, 4, 6, 8, 10 };
		int target = 7;

		SearchInsert searchInsert = new SearchInsert();

		System.out.println("BinarySearch Result = " + searchInsert.binarySearch(nums, target));
		System.out.println("LinearSearch Result = " + searchInsert.linearSearch(nums, target));
	}

	public int binarySearch(int[] nums, int target) {
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return left;
	}

	public int linearSearch(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return nums.length;
	}

}
