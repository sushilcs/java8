package com.sk.gfgProblems.arrays;
/*
 *  Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum 
 *  of ‘k’ consecutive elements in the array.
 * 
 */
public class Problem20 {

	public static void main(String[] args) {
		int arr[]= {100, 200, 300, 400}, k = 2;
		int start=0;
		int sum =0;
		int max=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		} 
		int prevValue =arr[start];
		max=sum;
		start++;
		int end =k;
		
		while(end<arr.length) {
			for(int i=start;i<=end;i++) {
				sum=sum+arr[start]-prevValue;
				if(sum>max) {
					max=sum;
				}
			}
			prevValue=arr[start];
			start++;
			end++;
		}
		System.out.println(max);
		
	}

}
