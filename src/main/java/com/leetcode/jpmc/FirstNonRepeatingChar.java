package com.leetcode.jpmc;

import java.util.*;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String s = "aabbcde";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : s.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey()); // Output: c
				break;
			}
		}
	}
}
