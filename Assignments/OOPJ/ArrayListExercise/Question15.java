package org.zarreen;

import java.util.TreeSet;

public class Question15 {
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		System.out.println(numbers.ceiling(25));
	}
}
