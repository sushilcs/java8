package com.sk.gfgProblems.arrays;

import java.util.ArrayList;
/*
 * https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
 * Given an array A[] of size N and a positive integer K, find the first negative integer for each 
 * and every window(contiguous subarray) of size K.
 */

public class Problem23 {

	public static void main(String[] args) {
		 int[] arr = {-8,2,3,-6,10};
	        int start = 0;
	        int end = 0;
	        int k = 2;

	        ArrayList<Integer> list = new ArrayList<>();

	        while (end < arr.length) {
	            // If given number is negative then add it into the list
	            if (arr[end] < 0) {
	                list.add(arr[end]);
	            }

	           
	            if ((end - start + 1) == k) {
	                // If list is empty then print zero
	                if (list.isEmpty()) {
	                    System.out.println(0);
	                } else {
	                    // Print and remove the first negative number encountered in the current subarray
	                    System.out.println(list.get(0));
	                    list.remove(Integer.valueOf(arr[start]));
	                }
	                start++;
	            }
	            end++;
	        }
	    }
	}




