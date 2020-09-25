package com.antriksh.streamapi.mapsort;

import java.util.HashMap;
import java.util.Map;

public class ClientMapSort {

	public static void main(String[] args) {

		Map<String ,Integer> map=new HashMap<>();
		map.put("Vihari", 99);
		map.put("dhanush", 97);
		map.put("Vikash",97 );
		map.put("Naveen",95 );
		map.put("Sandeep",90 );
		map.put("sonal",98 );
		System.out.println("display the map object");
		map.forEach((k,v)->System.out.println(k+ "\t"+ v));
		System.out.println("sorting the data by value");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("sorting the data by key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		 

	}

}
