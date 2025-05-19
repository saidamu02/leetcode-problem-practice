package com.leetcode.easy;

public class NeedleInHaystack {

	public static void main(String[] args) {

		String haystack = "sadbutsad";
		String needle = "sad";
		int hlen = haystack.length();
		int nlen = needle.length();
		System.out.println("Haystack Length = " + hlen + ", Needle Length = " + nlen);
		if (hlen < nlen)
			System.out.println("Needle is not found in Haystack.");
		for (int i = 0; i <= hlen - nlen; i++) {
			if (haystack.substring(i, i + nlen).equals(needle)) {
				System.out.println("Needle found at the index of " + i);
			}
		}
	}

}