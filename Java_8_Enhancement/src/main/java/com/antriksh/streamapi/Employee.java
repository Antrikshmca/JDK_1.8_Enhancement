package com.antriksh.streamapi;

import lombok.Data;


public class Employee {
	
	private String userName;
	private Integer salary;
	private Integer age;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Employee(String userName, Integer salary, Integer age) {
		super();
		this.userName = userName;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", salary=" + salary + ", age=" + age + "]";
	}
	

}
