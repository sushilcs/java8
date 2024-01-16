package com.sk.gfgProblems.arrays;

import java.util.stream.LongStream;

//https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&category=Arrays&difficulty=Easy

/*
 * Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array.
 *  Equilibrium point in an array is an index (or position) such that the sum of all elements before 
 *  that index is same as sum of elements after it.
   Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 
 */
public class Problem8 {

	public static void main(String[] args) {
		long A[] = {1,3,5,2,2} ;
		int n = A.length;
		long totalSum = LongStream.of(A).sum();
		long rightSum=0;
		long leftSum =0;
		for(int i=1;i<n;i++) {
			leftSum+=A[i-1];
			rightSum=totalSum-leftSum-A[i];
			if(leftSum==rightSum) {
				System.out.println(i+1);
				return ;
			}
		}
		if(leftSum!=rightSum) {
			System.out.println(-1);
		}

	}

}
