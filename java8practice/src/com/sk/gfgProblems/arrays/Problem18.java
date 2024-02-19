package com.sk.gfgProblems.arrays;
/*
 * find the largest subarray with sum k with sliding window technique.
 * 
 */

public class Problem18 {

	public static void main(String[] args) {
		int arr[]= {4,1,1,1,2,3,5};
		int k=5;
		int sum = 0;
		int max=0;
		int startingPoint=0; 
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==k) {
				int length =i;
				max=Math.max(max,++length);
				max=max-startingPoint;
			}
			else if(sum>k) {
				while(sum>k) {
					sum-=arr[startingPoint];
					startingPoint++;
				}
			}
			
		}
		System.out.println(max);

	}

}
