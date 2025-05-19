package com.leetcode.easy;

import java.util.Arrays;

public class ArrayValuePlusOne {
	public static void main(String[] args) {
		int[] digits = new int[] { 1, 9, 9, 9 };
		ArrayValuePlusOne arrayValuePlusOne = new ArrayValuePlusOne();
		System.out.println("Result = " + Arrays.toString(arrayValuePlusOne.plusOne(digits)));
	}

	public int[] plusOne(int[] digits) {
		int n = digits.length;

		// Traverse from the end (least significant digit)
		for (int i = n - 1; i >= 0; i--) {
			// If digit is less than 9, just add 1 and return
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			// If digit is 9, it becomes 0 and carry goes to next digit
			digits[i] = 0;
		}

		// If all digits were 9 (e.g., 999), create a new array with one extra digit
		int[] newNumber = new int[n + 1];
		newNumber[0] = 1; // e.g., 999 + 1 = 1000

		return newNumber;
	}

}
