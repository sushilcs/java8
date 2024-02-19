package com.sk.gfgProblems.arrays;
/*
 * 
 * https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?
 * page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions
 */

import java.util.HashSet;
import java.util.Set;

public class Problem12 {

	public static void main(String[] args) {
		
		        int n = 5, m = 3;
				int a[] = {89, 24, 75, 11,89, 23};
				int b[] = {89, 2, 89,4};
				int count=0;
				Set<Integer>setA = new HashSet<>();
			for(int i : a) {
			   setA.add(i);	
			}
			
			for(int i:b) {
				if(setA.contains(i)) {
				    setA.remove(new Integer(i));
					count++;
				}
			}
		System.out.println(count);

	}

}
