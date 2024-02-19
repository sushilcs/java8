package com.sk.gfgProblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 * Given an array of both positive and negative integers, the task is to 
 * compute sum of minimum and maximum elements of all sub-array of size k.
 * 
 */

public class Problem19 {

	public static void main(String[] args) {
		int arr[] = {2, 5, -1, 7, -3, -1, -2} ;
		int k = 4;
		int start = 0;
		int end = 0;
		int min =arr[0];
		int max =arr[0];
		int sum=0;
		for(int i=0;i<k;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			end = i;
		}
		end++;
		start++;
		sum+=min+max;
		
		while(end<arr.length) { 
			int index=0;
			min =arr[0];
			max =arr[0];
			for(int i = start; i<=end;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			start++;
			end++;
			sum+=min+max;
		}
		System.out.println(sum);

	}

}
