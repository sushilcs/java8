package com.sk.gfgProblems;

public class Problem2 {
	/*
	 * Given an array A of size N of integers. 
	 * Your task is to find the minimum and maximum elements in the array.
	 */

	public static void main(String[] args) {
		int arr[]= new int []{18,18,17,33};
		int max=arr[0];
		int secondMax=arr[0];
		for(int i:arr) {
			if(max<i) {
				secondMax=max;
				max=i;
			}
			else if((secondMax<i&&i!=max) || (secondMax==max && i<max))
				secondMax=i;
			}
		System.out.println("max = "+max+" secondMax= "+secondMax);
		}
		
		

	}


