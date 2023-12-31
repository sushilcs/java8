package com.sk.java8.streamPractice;

import java.util.Arrays;
import java.util.List;

/*
 * find out the  sum of integers greater than 10
 */
public class StreamExample {
	
	public static void main(String args[]) {
		List<Integer>list=Arrays.asList(11,12,13,14,15,16,17,18,19);
		int result=list.stream().filter(i->i>10).mapToInt(i->i).sum();
		System.out.println(result);
	}

}

