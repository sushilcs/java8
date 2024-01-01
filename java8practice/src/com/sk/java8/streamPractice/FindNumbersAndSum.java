package com.sk.java8.streamPractice;

import java.util.Arrays;
import java.util.List;

public class FindNumbersAndSum {

	public static void main(String[] args) {
		
		List<Integer>list = Arrays.asList(1,3,4,5,6,9,12,33,22,12,98);
		int sum=list.stream().filter(i->i%2==0).mapToInt(i->i).sum();
		System.out.println(sum);

	}

}
