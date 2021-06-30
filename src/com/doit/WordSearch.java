package com.doit;

public class WordSearch {
/*
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example 1:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
Example 2:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
Example 3:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
Constraints:

m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
 */
	public static void main(String[] args) {

		char[][] a = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

		String word = "ABCCDE";
		boolean flag = false;
		int[] b = new int[2];
		findFirstCharIndex(a, b, word.charAt(0));

		for (int k = 1; k < word.length(); k++) {
			checkNextChar(a, b, word.charAt(k));
			if (b[0] == -1) {
				flag = true;
				break;
			}
		}

		System.out.println(!flag ? "Matching !!" : "Not Matching");

	}

	static void findFirstCharIndex(char[][] a, int[] b, char c) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == c) {
					b[0] = i;
					b[1] = j;
					return;
				}
			}
		}
	}

	static int[] checkNextChar(char[][] a, int[] op, char c) {

		int i = op[0], j = op[1];

		if (j - 1 >= 0 && a[i][j - 1] == c) {
			op[0] = i;
			op[1] = j - 1;
		} else if (i - 1 >= 0 && a[i - 1][j] == c) {
			op[0] = i - 1;
			op[1] = j;
		} else if (j + 1 < a[i].length && a[i][j + 1] == c) {
			op[0] = i;
			op[1] = j + 1;
		} else if (i + 1 < a.length && a[i + 1][j] == c) {
			op[0] = i + 1;
			op[1] = j;
		} else {
			op[0] = -1;
			op[1] = -1;
		}

		return op;
	}

}
