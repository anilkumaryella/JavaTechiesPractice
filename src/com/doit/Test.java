package com.doit;

import java.util.stream.Stream;

public  class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("R","O","B").peek(System.out::println).forEach(System.out::println);

	}

}
