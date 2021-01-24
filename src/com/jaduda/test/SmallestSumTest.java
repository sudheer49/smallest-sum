package com.jaduda.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestSumTest {

	@Test
	public void test_findsmallestSum_one() {
		int[] input = {7,-2,-9,3,2,-1,-11,-3, 4,5,4};
		int result = SmallestSum.findsmallestSum(input);
		assertEquals(-21,result);
	}
	
	@Test
	public void test_findsmallestSum_two() {
		int[] input = {5,2,19,3,8,3,50};
		int result = SmallestSum.findsmallestSum(input);
		assertEquals(2,result);
	}
	
	@Test
	public void test_findsmallestSum_threee() {
		int[] input = {-5,-1,6,3,-9};
		int result = SmallestSum.findsmallestSum(input);
		assertEquals(-9,result);
	}
	
	@Test
	public void test_findsmallestSum_four() {
		int[] input = { -4, -2, 1, -9, 5, 3};
		int result = SmallestSum.findsmallestSum(input);
		assertEquals(-14,result);
	}
}
