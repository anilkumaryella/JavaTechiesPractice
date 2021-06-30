package com.doit;

/*
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
Note: Order of elements is not a concern

 */
public class MoveAllTheNegativeElementsToOneSideOfTheArray {

	public static void main(String[] args) {
		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

		int lastIndex = arr.length - 1;
		int firstIndex = 0;
		while (firstIndex < lastIndex) {
			if (arr[firstIndex] < 0 && arr[lastIndex] > 0) {
				firstIndex++;
				lastIndex--;
			} else if (arr[firstIndex] > 0 && arr[lastIndex] < 0) {
				swapElements(arr, firstIndex, lastIndex);
				firstIndex++;
				lastIndex--;
			} else if (arr[firstIndex] < 0 && arr[lastIndex] < 0) {
				firstIndex++;
			} else {
				lastIndex--;
			}

		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

	static void swapElements(int[] arr, int firstIndex, int secondIndex) {

		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
}
