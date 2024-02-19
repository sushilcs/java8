package com.sk.gfgProblems.arrays;
/*
 * https://www.geeksforgeeks.org/problems/save-ironman0227/1?page=
 * 2&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions
 */

public class Problem15 {

	public static void main(String[] args) {
		String str ="12a21";	
		String cleanedString = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		char[]strArr = cleanedString.toCharArray();
		System.out.println(cleanedString);
		int i=0,j=strArr.length-1;
		while(i<j) {
			if(strArr[i]==strArr[j]) {
				i++;
				j--;
			}
			else {
				System.out.println("false");
				return;
			}
		}
		if(i>j)
			System.out.println("true");
		else if(i==j) {
			if(strArr[i]==strArr[j]) {
				System.out.println("true");
				return;
			}
			else {
				System.out.println("false");
				return;
			}
		}
		System.out.println("false");
		

	}

}
