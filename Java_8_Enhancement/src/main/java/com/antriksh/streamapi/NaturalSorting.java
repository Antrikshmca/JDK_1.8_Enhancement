package com.antriksh.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalSorting {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(30, 45, 67, 89, 90, 34, 12, 58);
		List<Integer> list2 = list1.stream().sorted().collect(Collectors.toList());
		list2.forEach(System.out::println);

		// to use comparable interface
//		compareTo() accending order sorting
		System.out.println("Accendding ordr sorting ");
		List<Integer> list3 = Arrays.asList(30, 45, 67, 89, 90, 34, 12, 58);
		List<Integer> list4 = list3.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		

	}
}
