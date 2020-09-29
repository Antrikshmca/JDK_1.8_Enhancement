package com.antriksh.streamapi;

import java.util.stream.Stream;

public class ToConvertStringIntoStreamObject {

	public static void main(String[] args) {
       
		String []str= {"ashok","vishal","vihari","dhanush","Abhishek"};
		System.out.println("Natural order sorting");
		Stream.of(str).sorted((i1,i2)->i1.compareTo(i2)).forEach(System.out::println);
		
		System.out.println("Customize  order sorting");
		Stream.of(str).sorted((i1,i2)->-i1.compareTo(i2)).forEach(System.out::println);
		
	}

}
