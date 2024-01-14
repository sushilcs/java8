package com.sk.gfgProblems.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an array of N integers, and an 
 * integer K, find the number of pairs 
 * of elements in the array whose sum is equal to K.
 * N = 4, K = 6
	arr[] = {1, 5, 7, 1}
	Output: 2
	Explanation: 
	arr[0] + arr[1] = 1 + 5 = 6 
	and arr[1] + arr[3] = 5 + 1 = 6.
 */

public class Problem6 {

	public static void main(String[] args) {
	 Long arr[]= {1L,5L,5L,5L,5L,7L};
	 int k =10;
	 int res=0;
	 Map<Long,Long>map = new HashMap<>();
	 for(Long i:arr) {
		 Long diff = k-i;
		 if(map.containsKey(diff)) {
			 res+=map.get(diff);
			 //map.put(i,res+1);
		 }
			if(map.containsKey(i)) {
				
				map.put(i, map.get(i)+1);
				
			}
			else {
				map.put(i, 1L);
			}
	 }
	 System.out.println(res);

}
}
