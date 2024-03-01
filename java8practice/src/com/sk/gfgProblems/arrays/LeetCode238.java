package com.sk.gfgProblems.arrays;

import java.util.Arrays;

public class LeetCode238 {

	public static void main(String[] args) {
		int arr[]= {0,3,-5,-2,8,-7,-6,-2,-3,-9};
		int n = arr.length;
		long[]prefix=new long[n];
        long[]suffix=new long[n];
        prefix[0]=arr[0];
        suffix[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
        prefix[i]=prefix[i-1]*arr[i];
        for(int i=n-2;i>=0;i--)
        suffix[i]=arr[i]*suffix[i+1];
        Arrays.sort(prefix);
        Arrays.sort(suffix);
        
        System.out.println(Math.max(prefix[n-1],suffix[n-1]));
		

	}

}
