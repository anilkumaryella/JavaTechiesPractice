package com.doit;
/*
 * You are given a list of n-2 integers and these integers are in the range of 1 to n. There are no duplicates in the list. 2 consecutive integers are missing in the list. Write an efficient code to find the missing integers.
Example: 

Input: arr[] = {1, 2, 6, 3, 7, 8}
Output: 4,5
Explanation: The missing numbers from 1 to 8 are 4,5

Input: arr[] = {1, 2, 5}
Output: 3,4
Explanation: The missing numbers from 1 to 5 are 3,4
 */
public class Find2ConsecutiveMissingNumbersInASequentialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 6, 3, 7, 8 };
		int n = nums.length + 2;
		int totalSum = n * (n + 1) / 2;

		int sum = 0;

		for (int a : nums) {
			sum += a;
		}
		int first = (totalSum - sum - 1) / 2;
		int second = first + 1;

		System.out.println("First :" + first + " Second:" + second);
	}

}
