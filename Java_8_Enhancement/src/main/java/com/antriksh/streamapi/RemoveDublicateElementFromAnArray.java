package com.antriksh.streamapi;

import java.util.Arrays;

public class RemoveDublicateElementFromAnArray {

	public static void main(String[] args) {
     int []arr= {3,4,6,3,7,8,0,5,1};
     Arrays.stream(arr).distinct().sorted().forEach(System.out::println);
	}

}
