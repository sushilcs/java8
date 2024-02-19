package com.sk.gfgProblems.arrays;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/
 * 1?page=1&difficulty=Easy&status=unsolved&sortBy=submissions
 */

public class Problem14 {

	public static void main(String[] args) {
		int N = 8, M = 5;
		int i=0,j=M-1;
		int diff = Integer.MAX_VALUE;
	    int A[] = {3, 4, 1, 9, 56, 7, 9, 12};
	    Arrays.sort(A);
	    while(j<N) {
	      int min = A[j]-A[i];
	      if(min<diff) {
	    	  diff = min;
	      }
	      i++;
	      j++;
	    }
	    System.out.println("min diff = "+diff);
	    
	    
	}

}
