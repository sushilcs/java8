package com.sk.gfgProblems.arrays;
/*
 * 
 * minimum jump needed to reach end of the array.
 * https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&category=Arrays,
 * Strings&difficulty=Easy,Medium&sortBy=submissions
 * 
 * 
 * 
 * 
 */

public class Problem29 {

	public static void main(String[] args) {
		int arr[]= {1, 3, 5, 8, 0, 2, 6, 7, 6, 8, 9};
		int n = arr.length-1;
		
		int step = 0;
		int current=0;
		int reach = 0;
		if(arr[0]==0) {
			step = -1;
		}
		if(n==1) {
			step =1 ;
		}
		for(int i=0;i<n;i++) {
			reach = Math.max(reach, reach + arr[i]);
			if(i==current) {
				current = reach;
				step++;
				if(reach>=n) {
					System.out.println("reached"+step);
					return ;
				}
			}
			
		}
		System.out.println(step);

	}

}
