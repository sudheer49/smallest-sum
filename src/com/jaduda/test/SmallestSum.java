package com.jaduda.test;

public class SmallestSum {

	public static void main(String[] args) {

		int[] a = { 5, 2, 19, 3, 8, 3, 50 };
		findsmallestSum(a);
	}

	/**
	 * This method to calculate the smallest sum of consecutive elements from array
	 * 
	 * @param elements
	 * @return
	 */
	public static int findsmallestSum(int[] elements) {
		int smallestSum = elements[0];
		int currentSum = 0;

		for (int i = 0; i < elements.length; i++) {
			currentSum = elements[i];
			if (smallestSum > currentSum) {
				smallestSum = currentSum;
			}
			for (int j = i + 1; j < elements.length - 1; j++) {
				currentSum = currentSum + elements[j];
				if (smallestSum > currentSum) {
					smallestSum = currentSum;
				}
			}
		}
		System.out.println("The smallest sum of consecutive elements is :"+smallestSum);
		return smallestSum;
	}
}
