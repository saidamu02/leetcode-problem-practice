package com.leetcode.easy;

public class LastWordLength {
	public static void main(String[] args) {
		String s = "Hello World Bhaiya Kaise Ho";
		String[] words = s.split(" ");
		System.out.println("Last Word Length ::" + words[s.split(" ").length - 1].length());
	}
}