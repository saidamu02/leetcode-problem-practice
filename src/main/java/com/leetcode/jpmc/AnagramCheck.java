package com.leetcode.jpmc;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
		String s1 = "listen", s2 = "silent";
		char[] a1 = s1.toCharArray(), a2 = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println(Arrays.equals(a1, a2)); // Output: true
	}
}
