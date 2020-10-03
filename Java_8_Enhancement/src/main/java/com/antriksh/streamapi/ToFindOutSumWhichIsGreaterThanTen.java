package com.antriksh.streamapi;

import java.util.Arrays;
import java.util.List;

public class ToFindOutSumWhichIsGreaterThanTen {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4,56,7,11,5,12,7);
		int sum = list.stream().filter(i ->i>10).mapToInt(i->i).sum();
		System.out.println("sum of number "+ sum);
	}

}
