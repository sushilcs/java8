package com.sk.gfgProblems.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
/*
 * Given an array containing N integers and an integer K.,
 *Your task is to find the length of the longest
 * Sub-Array with the sum 
 * of the elements equal to the given value K.
 */

//solved with Hashing technique 
// other methods can be used = sliding window technique
public class Problem4 {

	public static void main(String[] args) {
		int A[]= {7,4,-17,-13,-15,1,16,7,16,-15,-7,-7,-18,19,11,-13,10,-16};
		int K=30;
		int N=18;
		int sum=0;
		int ln =0;
		 Map<Integer,Integer>m=new LinkedHashMap<>();
	        for(int i = 0; i < N; i++){
	            sum = sum+A[i];
	            if(sum==K){
	                ln = i+1;
	            }
	            if(m.containsKey(sum-K) &&(i-m.get(sum-K)>ln)){
	                ln = i - m.get(sum-K);
	            }
	            if(!m.containsKey(sum)){
	                m.put(sum,i);
	            }
	        }
	        System.out.println("Max length of SubArray = "+ln);
	}

}

