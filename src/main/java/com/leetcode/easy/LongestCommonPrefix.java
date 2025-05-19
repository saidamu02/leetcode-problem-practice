package com.leetcode.easy;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		String[] strs = new String[] { "flower", "flow", "flight" };
		String prefix = longestCommonPrefix.longestCommonPrefix(strs);
		System.out.println("Result :: " + prefix);
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String prefix = strs[0]; // Assume first string is the prefix
		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(prefix)) {
				// Shorten the prefix until it matches
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}
}