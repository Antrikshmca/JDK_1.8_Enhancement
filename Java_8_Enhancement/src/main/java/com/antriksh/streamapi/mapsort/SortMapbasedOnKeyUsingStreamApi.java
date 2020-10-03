package com.antriksh.streamapi.mapsort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.antriksh.streamapi.Employee;

public class SortMapbasedOnKeyUsingStreamApi {

	public static void main(String[] args) {

		Map<Employee, Integer> map = new HashMap<>();
		map.put(new Employee("Sandeep", 1236, 40), 12301);
		map.put(new Employee("Naveen", 1276, 12), 12302);
		map.put(new Employee("Vihari", 6236, 56), 12303);
		map.put(new Employee("Dhanush", 4236, 30), 12304);
		map.put(new Employee("Akshit", 4567, 37), 12305);
		map.put(new Employee("Arun", 3236, 36), 12306);
		
		System.out.println("sorting by key in accending order" +"\n");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);
		
		System.out.println("sorting by key in Decending Order order"+"\n");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
				.forEach(System.out::println);
	}

}
