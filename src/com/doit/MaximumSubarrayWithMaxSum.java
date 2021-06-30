package com.doit;
/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Constraints:

1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105
 */
public class MaximumSubarrayWithMaxSum {

	public static void main(String[] args) {

		int[] arr = { 5, 4, -1, 7, 8 };
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);

	}

}
