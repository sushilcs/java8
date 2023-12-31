package com.sk.java8.streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapExample {

	public static void main(String[] args) {
		Stream<List>stream=Stream.of(Arrays.asList(1,2,3),Arrays.asList(
				4,5,6),Arrays.asList(7,8,9),Arrays.asList(10,11,12));
		
		Stream<Integer>intStream=stream.flatMap(i->i.stream());
		intStream.forEach(i->System.out.println(i));

	}

}
