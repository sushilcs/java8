package com.sk.gfgProblems.arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array arr containing N integers and 
 * a positive integer K, find the length of 
 * the longest sub array with 
 * sum of the elements divisible by the given value K.
 */
public class Problem5 {

	public static void main(String[] args) {
		int arr[]= {-1,9,9};
		int N=3;//arr.length;
		int K = 9;
		int sum=0;
		int ln=0;
		int count =0;
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<N;i++) {
			sum+=arr[i];
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
			int rem=sum%K;
			if(rem==0) {
				ln=i+1;
			}
			if(map.containsKey(rem)&& i-map.get(rem)>ln) {
				ln=i-map.get(rem);
			}
		}
		System.out.println(ln);
	}

}
