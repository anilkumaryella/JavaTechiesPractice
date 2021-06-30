package com.doit;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String s = "{}()[()][]";
		Stack<Character> stack = new Stack<>();

		Map<Character, Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[')
				stack.add(c);
			else {
				if (stack.isEmpty() || stack.pop() != map.get(c)) {
					System.out.println(false);
					return;
				}
			}
		}
		System.out.println(true);
	}

}
