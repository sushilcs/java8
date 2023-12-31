package com.sk.java8.streamPractice;

import java.util.stream.Stream;

/*
 * Terminal Operations
 */
public class StreamReduceExample {

	public static void main(String[] args) {
      Stream<Integer>numbers=Stream.of(1,3,4,5,6,6,8,9,10);
      int result=numbers.reduce((i,j)->i*j).get();
      System.out.println("multiplication result= "+result);
      Stream<Integer>numbers1=Stream.of(1,3,4,5,6,6,8,9,10);
      System.out.println("count of the number of elements in the list= "+numbers1.count());
      
	}

}
