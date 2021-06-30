package com.doit;

import java.util.Arrays;
import java.util.LinkedList;
/*
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

Example 1:


Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: l1 = [], l2 = []
Output: []
Example 3:

Input: l1 = [], l2 = [0]
Output: [0]
Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both l1 and l2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLinkedLists {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4));
		LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 4));

		LinkedList<Integer> resultList = new LinkedList<>();

		if (list1.getLast() < list2.getFirst()) {
			resultList.addAll(list1);
			resultList.addAll(list2);
		} else if (list2.getLast() < list1.getFirst()) {
			resultList.addAll(list2);
			resultList.addAll(list1);
		} else {
			int i = 0, j = 0;
			while (i < list1.size()) {
				while (j < list2.size()) {
					if (list1.get(i) > list2.get(j)) {
						resultList.add(list2.get(j));
						j++;
					} else if (list1.get(i) < list2.get(j)) {
						resultList.add(list1.get(i));
						i++;
					} else {
						resultList.add(list1.get(i));
						resultList.add(list2.get(j));
						i++;
						j++;
					}
				}
			}
		}
		System.out.println(resultList);
	}

}
