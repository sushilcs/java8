package com.sk.gfgProblems.arrays;
/*
 * https://www.geeksforgeeks.org/problems/remove-
 * all-duplicates-from-a-given-string4321/1?page=2&category=Arrays&difficulty
 * =Easy&status=unsolved&sortBy=submissions
 * 
 */

public class Problem16 {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char[]charArr = str.toCharArray();
		String str1="";
		for(int i=0;i<charArr.length;i++) {
			if(!str1.contains(""+charArr[i])) {
				str1+=charArr[i];
			}
		}
		System.out.println(str1);
	}

}
