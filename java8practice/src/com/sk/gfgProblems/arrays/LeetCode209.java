package com.sk.gfgProblems.arrays;

public class LeetCode209 {

	public static void main(String[] args) {
		// slidingWindow Approach(variable size window)
		int nums[] = { 10, 5, 13, 4, 8, 4, 5, 11, 14, 9, 16, 10, 20, 8 };
		int n = nums.length;
		int sum = 0;
		int mini = Integer.MAX_VALUE;
		int start = 0;
		int end = 0;
		int k = 80;

		while (end < n) {
			sum += nums[end];
			while (sum >= k) {
				mini = Math.min(mini, end - start + 1);
				sum -= nums[start++];
			}
			end++;
		}
		System.out.println(mini);
	}
}
