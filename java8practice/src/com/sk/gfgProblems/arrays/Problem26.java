package com.sk.gfgProblems.arrays;

import java.util.HashMap;
/*
 * https://www.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1
 */
public class Problem26 {

	public static void main(String[] args) {
		int a[] = {-2,-7,-6,-1,-4,-5};
		int n = a.length;
		HashMap<Integer,Integer>remainder = new HashMap<>();
		int k = 3;
		remainder.put(0, -1);
		int reminder = 0;
		int length =0;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum+a[i];
			reminder = sum%k;
			if(reminder<0) {
				reminder = reminder+k;
			}
			if(remainder.containsKey(reminder)) {
				length = Math.max(length,i-remainder.get(reminder));
			}
			else {
				remainder.put(reminder, 1);
			}
				
		}
		System.out.println(length);

	}

}
