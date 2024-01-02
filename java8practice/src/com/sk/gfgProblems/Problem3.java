package com.sk.gfgProblems;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given an array A of positive integers. Your task is to find 
 * the leaders in the array. An element of array is a leader if it is greater than or equal to all the elements
 * to its right side. The rightmost element is always a leader. 
 * n = 6
   A[] = {16,17,4,3,5,2}
   Output: 17 5 2
 */
public class Problem3 {

	public static void main(String[] args) {
		int arr[]=new int[] {16,17,4,3,5,2};
		int n = arr.length;
		ArrayList<Integer> arrayList = new ArrayList<>();
		int leader = arr[n-1];
		arrayList.add(leader);
		for(int i=n-2;i>=0;i--) {
			if(leader<=arr[i]) {
				leader = arr[i];
				arrayList.add(leader);
			}
		}
		Collections.reverse(arrayList);
		System.out.println(arrayList);

	}

}
