package com.leetcode.jpmc;

public class PrimeChecker {
	public static boolean isPrime(int num) {
		if (num <= 1)
			return false; // 0 and 1 are not prime
		if (num == 2)
			return true; // 2 is the only even prime number
		if (num % 2 == 0)
			return false; // eliminate even numbers > 2

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		int number = 29; // change this to test other numbers
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is NOT a prime number.");
		}
	}
}