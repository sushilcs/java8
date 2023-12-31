package com.sk.java8.streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * filter all the element in the list greater than 90.
 */
public class StreamFilterExample {
	
	public static void main(String args []) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,91,109,334,222,12);
		Stream<Integer>stream=list.stream().filter(i->i>90);
		stream.forEach(i->System.out.println(i));
		
	}

}
