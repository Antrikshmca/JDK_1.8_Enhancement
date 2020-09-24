package com.antriksh.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class FilterMethod {

	public static void main(String[] args) {
		
		List<Integer> list1= Arrays.asList(30,45,67,89,90,34,12,58);
		List<Integer> list2=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		list2.forEach(System.out::println);
	}
}
