package com.leetcode.medium;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 3, 4, 2, 2 };
		System.out.println("Duplicate Value ::" + FindDuplicate.findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		// Floyd's Tortoise and Hare starts here
		int slow = nums[0];
		int fast = nums[0];

		// Phase 1: Find intersection point
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		// Phase 2: Find entrance to cycle (duplicate number)
		slow = nums[0];
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}

		return slow;
	}
}