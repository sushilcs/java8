package com.sk.java8.streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 * Merge two Employee ArrayList and sort by age in using java8 stream API
 */

public class EmployeeMergingAndSorting {
	
	public static class Employee{
		private String name;
		private int age;
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		Employee(String name,int age){
			this.name=name;
			this.age=age;
			
		}


		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + "]";
		}
		
	}
	public static void main(String args[]) {
		Employee employee1 = new Employee("Sushil",24);
		Employee employee2 = new Employee("Ravi",21);
		Employee employee3 = new Employee("Akash",22);
		Employee employee4 = new Employee("Prakash",23);
		Employee employee5 = new Employee("Rohit",25);
		Employee employee6 = new Employee("Mohit",26);
		List<Employee> emplist1=Arrays.asList(employee1,employee2,employee3);
		List<Employee> emplist2=Arrays.asList(employee4,employee5,employee6);
		List<Employee>mergedAndSortedList=Stream.concat(emplist1.stream(),emplist2.stream())
		.sorted((e1,e2)->e1.name.compareTo(e2.name)).collect(Collectors.toList());
		System.out.println(mergedAndSortedList);
		
	}

}
