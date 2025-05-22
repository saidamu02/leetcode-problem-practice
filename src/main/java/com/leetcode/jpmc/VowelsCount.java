package com.leetcode.jpmc;

public class VowelsCount {
	public static void main(String[] args) {
		String str = "Java Programming";
		int count = 0;
		for (char c : str.toLowerCase().toCharArray()) {
			if ("aeiou".indexOf(c) != -1)
				count++;
		}
		System.out.println(count); // Output: 5
	}
}
