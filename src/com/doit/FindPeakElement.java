package com.doit;
/*
 * A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
 */
public class FindPeakElement {

	/*
	 * Input: nums = [1,2,3,1] Output: 2 Explanation: 3 is a peak element and your
	 * function should return the index number 2.
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1, 3, 5, 6, 4 };

		int n = nums.length - 1, peakIndex = Integer.MIN_VALUE;
		if (nums[0] > nums[1]) {
			peakIndex = 0;
		} else if (nums[n] > nums[n - 1]) {
			peakIndex = n;
		} else {
			for (int i = 1; i <= n - 1; i++) {
				if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
					peakIndex = i;
					break;
				}
			}
		}
		System.out.println(peakIndex);
	}

}
