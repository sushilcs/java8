package com.sk.java8.streamPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTotalNumberOfElements {

	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(1,121,121,3434,36,36,78,28,78,1012);
		
		// find count of elements present in the list.
		/*
		 * long numberOfElements=list.stream().count();
		 * System.out.println(numberOfElements);
		 */
		// find elements starts with 1
		
		
		/*
		 * long
		 * numbersOfElements=list.stream().map(i->i+"").filter(i->i.startsWith("1")).
		 * count(); System.out.println(numbersOfElements);
		 */
		
		// find duplicate elements present in the list
		Set<Integer>set = new HashSet<>();
		int size=list.stream().filter(i->!set.add(i)).collect(Collectors.toList()).size();
		System.out.println(size);
		
		
	}

}
