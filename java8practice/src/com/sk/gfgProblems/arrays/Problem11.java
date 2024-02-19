package com.sk.gfgProblems.arrays;

/*
 * https://www.geeksforgeeks.org/problems/missing-number-in
 * -array1416/1?page=1&difficulty=Easy&status=unsolved&sortBy=submissions
 */

public class Problem11 {

	public static void main(String[] args) {
		int A[] = {6,1,2,8,3,4,7,10,5};
		int n = 10;
		int sum1 = n*(n+1)/2;
		int sum2=0;
		for(int i=0;i<A.length;i++) {
			sum2=sum2+A[i];
		}
		System.out.println(sum1-sum2);

	}

}
