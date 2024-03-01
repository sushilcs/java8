package com.sk.gfgProblems.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
 * https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
 * Given an array arr[] of size N and an integer K. 
 * Find the maximum for each and every contiguous subarray of size K.
 */

public class Problem25 {

	public static void main(String[] args) {

		int arr[] = {1,12,8,1,4,3,2,6};
		int n = arr.length;
		int k = 3;
		int r[]= new int [n-k+1];
		int ri =0;
		Deque<Integer>q = new ArrayDeque();
		for(int i =0 ;i< n;i++) {
			if(!q.isEmpty()&& q.peek() == i-k) {
				q.poll();
			}
			while(!q.isEmpty() && arr[q.peekLast()]<=arr[i]) {
				q.pollLast();
			}
			q.offer(i);
			if(i>=k-1) {
				r[ri++] = arr[q.peek()];
			}
		}
		System.out.println(Arrays.toString(r));
	}
}
