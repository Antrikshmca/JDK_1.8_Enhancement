package com.antriksh.streamapi;

import java.util.Arrays;

public class ForEachOrderedExample {

	public static void main(String[] args) {
     
		int []arr= {4,5,6,7,8,90,67,3,4,5,6};
		System.out.println("It is used to maintain the ordered");
		Arrays.stream(arr).forEachOrdered(System.out::println);
		System.out.println("it is not maintain the ordered");
		Arrays.stream(arr).forEach(System.out::println);
		
		
		
		
	}

}
