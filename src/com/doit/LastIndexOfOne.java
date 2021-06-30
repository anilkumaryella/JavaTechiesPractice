package com.doit;
/*
 * Given a string S consisting only �0�s and �1�s,  find the last index of the �1� present in it.

Example 1:

Input:
S = 00001
Output:
4
Explanation:
Last index of  1 in given string is 4.
Example 2:

Input:
0
Output:
-1
Explanation:
Since, 1 is not present, so output is -1.

Your Task:  
You don�t need to read input or print anything. Your task is to complete the function lastIndex() which takes the string S as inputs and returns the last index of �1�. If �1� is not present, return �-1� (without quotes).

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= |S| <= 106
S = {0,1}
 */
public class LastIndexOfOne {

	public static void main(String[] args) {

		String input = "00010001";
		int index = -1;
		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) == '1') {
				index = i;
				break;
			}
		}

		System.out.println("Index is: " + index);
	}

}
