package com.doit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ThirdNonRepeatedChar {
	/*
	 * How to print 3rd non repeated char from string Input: Preeti Output: t
	 * 
	 * input: preetip Output: i
	 */
	public static void main(String[] args) {
		Map<Character, Boolean> map = new LinkedHashMap<>();
		String s = "preetip";

		for (int i = 0; i < s.length(); i++)
			map.put(s.charAt(i), !map.containsKey(s.charAt(i)) ? true : false);

		int count = 0;

		for (Entry<Character, Boolean> entry : map.entrySet()) {

			if (entry.getValue())
				count++;
			if (count == 3) {
				System.out.println(entry.getKey());
				return;
			}
		}
		System.out.println("No elements");
	}

}
