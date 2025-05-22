package com.leetcode.jpmc;

public class CheckPalindrome {
	public static void main(String[] args) {
		String word = "madam1";
		boolean isPalindrome = true;

		int i = 0;
		int j = word.length() - 1;

		while (i < j) {
			if (word.charAt(i) != word.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}

		if (isPalindrome) {
			System.out.println(word + " is a palindrome.");
		} else {
			System.out.println(word + " is not a palindrome.");
		}
	}
}
