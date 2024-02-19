package com.sk.gfgProblems.arrays;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {

	public static void main(String[] args) {
		int N=6;
		int x =7;
		int a[]= {1,4,2,6,3,8,5,9};
		int sum =0;
		List<Integer>list = new ArrayList<>();
		for(int i=0;i<a.length;i++){
	       for(int j=i+1;j<a.length;j++)	{
	    	   if(a[i]+a[j]<10)
	    	   list.add(a[i]+a[j]);
	       }
		}
	    System.out.println(list);		
	
	}
}
