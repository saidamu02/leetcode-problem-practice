package com.leetcode.easy;

public class TriangleType {
	public static void main(String[] args) {
//		int[] nums = new int[] { 3, 3, 3 }; // "equilateral"
//		int[] nums = new int[] { 3, 4, 5 }; // "scalene"
//		int[] nums = new int[] { 3, 3, 6 }; // "isosceles"
//		int[] nums = new int[] { 8, 4, 2 }; // "none"
		int[] nums = new int[] { 2, 7, 7 }; // "isosceles"

		System.out.println("Triangle Type is " + TriangleType.triangleType(nums));
	}

	public static String triangleType(int[] nums) {		
		// Triangle inequality check
	    if (nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[1] + nums[2] <= nums[0]) {
	        return "none";
	    } else if (nums[0] == nums[1] && nums[1] == nums[2] ) {
			return "equilateral";
		} else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
			return "isosceles";
		} else {	
			return "scalene";
		}
	}
}
