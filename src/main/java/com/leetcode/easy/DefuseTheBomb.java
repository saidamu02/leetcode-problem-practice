package com.leetcode.easy;

import java.util.Arrays;

public class DefuseTheBomb {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(DefuseTheBomb.decrypt(new int[] { 5, 7, 1, 4 }, 3))); // [12,10,16,13]
//		System.out.println(Arrays.toString(DefuseTheBomb.decrypt(new int[] { 1, 2, 3, 4 }, 0))); // [0,0,0,0]
		System.out.println(Arrays.toString(DefuseTheBomb.decrypt(new int[] { 2, 4, 9, 3 }, -2))); // [12,5,6,13]
//		System.out.println(Arrays.toString(DefuseTheBomb.decrypt(new int[] { 1, 2, 3, 4, 5, 6 }, 2))); // Example of longer case
	}

	public static int[] decrypt(int[] code, int k) {
		int n = code.length;
		int[] result = new int[n];

		// If k == 0, fill with 0s and return early
		if (k == 0) {
//			Arrays.fill(result, 0);
			return result;
		}

		// Loop through each index in the array
		for (int i = 0; i < n; i++) {
			int sum = 0;

			// When k > 0, sum the next k elements
			if (k > 0) {
				for (int j = 1; j <= k; j++) {
					int index = (i + j) % n; // wrap around using modulo
					sum += code[index];
				}
			}
			// When k < 0, sum the previous k elements
			else {
				for (int j = 1; j <= -k; j++) {
					// (i - j + n) % n ensures wrapping backward
					int index = (i - j + n) % n;
					sum += code[index];
				}
			}

			result[i] = sum;
		}

		return result;
	}
}
