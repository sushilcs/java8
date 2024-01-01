package com.sk.java8.streamCodePractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * find employees name starting with alphabet A using stream API
 */

public class EmployeeName {
	public static void main(String args[]) {
		List<String>list = Arrays.asList("hindi","Akash","Bharat","Amar","Ajay","ddd");
		  List<String>list1=list.stream().filter(s->s.startsWith("A")).collect(
		  Collectors.toList()); System.out.println(list1);
		 
	}
}
