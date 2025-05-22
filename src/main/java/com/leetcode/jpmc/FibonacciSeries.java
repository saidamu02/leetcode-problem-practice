package com.leetcode.jpmc;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 5, a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int temp = a + b;
			a = b;
			b = temp;
		}
		// Output: 0 1 1 2 3
	}
}
