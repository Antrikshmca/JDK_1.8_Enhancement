package com.antriksh.streamapi.mapsort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.antriksh.streamapi.Employee;

public class SortMapUsingTraditionalApproach {

	public static void main(String[] args) {
		Map<Employee, Integer> map = new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) o1.getSalary() - o2.getSalary();
			}
		});
		map.put(new Employee("Sandeep", 1236, 40), 12301);
		map.put(new Employee("Naveen", 1276, 12), 12302);
		map.put(new Employee("Vihari", 6236, 56), 12303);
		map.put(new Employee("Dhanush", 4236, 30), 12304);
		map.put(new Employee("Akshit", 4567, 37), 12305);
		map.put(new Employee("Arun", 3236, 36), 12306);
		
		map.forEach((k,v)->System.out.println(k +"\t" +v));
	}

}
