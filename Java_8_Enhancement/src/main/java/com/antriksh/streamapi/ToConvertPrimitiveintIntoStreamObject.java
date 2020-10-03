package com.antriksh.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ToConvertPrimitiveintIntoStreamObject {

	public static void main(String[] args) {

		int[] arr = { 67, 56, 45, 78, 9, 66, 53, 74 };
		// Stream.of(arr).sorted();
		System.out.println("to print even number");
		Arrays.stream(arr).filter(i -> i % 2 == 0).forEach(System.out::println);
		System.out.println("find the maximum number");
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(max);
		Stream.of(arr).sorted().forEach(System.out::println);
		System.out.println("stream of finite integers");
		IntStream oneToTen = IntStream.range(1, 11);
		oneToTen.forEach(System.out::println);
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		
		System.out.println("decending order sorting");
		List<Integer> list = Arrays.asList(34,45,6,7,89,04,46);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//convert aaray data to collection after that convert into stream
		String []s= {"a","b"};
		ArrayList list1= new ArrayList(Arrays.asList(arr));
		//list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
