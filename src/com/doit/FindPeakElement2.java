package com.doit;

public class FindPeakElement2 {

	/*
	 * Input: nums = [1,2,3,1] Output: 2 Explanation: 3 is a peak element and your
	 * function should return the index number 2.
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1, 9, 5, 6, 4 };

		int start = 0, end = nums.length - 1;
		int peak = Integer.MIN_VALUE, peakIndex = Integer.MIN_VALUE, prevPeakIndex = Integer.MIN_VALUE;
		while (start <= end) {
			int temp;
			if (nums[start] > nums[end]) {
				temp = nums[start];
				peakIndex = start;
			} else {
				temp = nums[end];
				peakIndex = end;
			}
			if (temp > peak) {
				peak = temp;
				prevPeakIndex = peakIndex;
			}

			start++;
			end--;
		}
		System.out.println(prevPeakIndex);
	}

}
