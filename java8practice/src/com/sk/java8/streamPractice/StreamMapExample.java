package com.sk.java8.streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
  public static void main(String args[]) {
	  List<String>list=Arrays.asList("sushil","kumar","yadav","bihar");
	  list=list.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
	  System.out.println(list);
  }
}
