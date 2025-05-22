package com.leetcode.jpmc;

import java.util.Arrays;

public class MaxInArray {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 9, 3 };
		int maxValue = Arrays.stream(arr).max().getAsInt();
		System.out.println("Max Value : " + maxValue);
		int max = arr[0];
		for (int num : arr) {
			if (num > max)
				max = num;
		}
		System.out.println("Max ::" + max); // Output: 9
	}
}