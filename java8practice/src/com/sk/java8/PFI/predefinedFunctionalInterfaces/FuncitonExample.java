package com.sk.java8.PFI.predefinedFunctionalInterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FuncitonExample {
	
	public static void main(String args[]) {
		List<String> list = Arrays.asList("aa","bbbb","cccccc","dddddddddd","ee","fffffffffff");
		System.out.println(convertListToMap(list, x->x.length()));
	}

	private static Map<Integer,String> convertListToMap(List<String> list,Function<String,Integer>function) {
		Map<Integer,String>map=new HashMap<>();
				for(String s :list) {
					map.put(function.apply(s), s);
					
				}
		
		return map;
	}

}
