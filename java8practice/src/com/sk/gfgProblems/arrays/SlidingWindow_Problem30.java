package com.sk.gfgProblems.arrays;

import java.util.ArrayList;
/*
 * https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=
 * 1&category=sliding-window&difficulty=Easy,Medium&sortBy=submissions
 * 
 */

public class SlidingWindow_Problem30 {

	public static void main(String[] args) {
		int start = 0, end = 0, sum = 0;
		int arr[] = { 1, 2, 3, 8, 6 };
		int s = 7;
		int n = arr.length;

		ArrayList<Integer> ans = new ArrayList<>();

		while (end < n) {
			sum = sum + arr[end];

			while (sum > s && start <= end) {
				sum = sum - arr[start];
				start++;
			}

			if (sum == s && start <= end) {
				ans.add(start + 1);
				ans.add(end + 1);
				System.out.println(ans);
				return;
			}

			end++;
		}

		ans.add(-1);
		System.out.println(ans);
		return;

	}

}
