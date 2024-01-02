package com.sk.gfgProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * Given an array a of size N which contains elements from 0 
 * to N-1, you need to find all the elements occurring more than
 * once in the given array. Return the answer in ascending order. 
 * If no such element is found, return list containing [-1]. 
 */
//1,2,3,4,5,6,4,3,2,1
public class Problem1 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 4, 3, 2, 1 };

		List<Integer> list = new ArrayList<>();
		/*
		 * Map<Integer, Integer> map = new TreeMap<>(); for (Integer obj : arr) { if
		 * (map.containsKey(obj)) { map.put(obj, map.get(obj) + 1); } else {
		 * map.put(obj, 1); } } for (Entry<Integer, Integer> entry : map.entrySet()) {
		 * if (entry.getValue() > 1) { list.add(entry.getKey()); } } if (list.size() ==
		 * 0) { list.add(-1); } System.out.println(list);
		 */

		// with sequence array
		
		/*
		 * Arrays.sort(arr); int arr1[]=new int[arr[arr.length-1]+1];
		 * 
		 * for(int i:arr) {
		 * 
		 * arr1[i]++; } for(int i:arr) { if(arr1[i]>1&&!list.contains(i)) { list.add(i);
		 * } } if(list.size()==0) { list.add(-1); } else { Collections.sort(list); }
		 * 
		 * System.out.println(list);
		 */
		 
	}

}
