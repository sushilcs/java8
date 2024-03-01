package com.sk.gfgProblems.arrays;

import java.util.HashMap;
/*
 * https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&category=Arrays,
 * Strings&difficulty=Easy,Medium&sortBy=submissions
 * 
 */

public class Problem27 {

	public static void main(String[] args) {
		int a[] = {3,1,3,3,2};
		HashMap<Integer,Integer>map = new HashMap<>();
        int result = -1;
        int size = a.length;
        for(int i = 0;i < size; i++){
           if(map.containsKey(a[i]))
           map.put(a[i],map.get(a[i])+1);
           else
           map.put(a[i],1);
        }
        for(int i = 0 ;i < size; i++){
            if(map.get(a[i]) > size/2)
            System.out.println(a[i]);
        }
        System.out.println(result);

	}

} 
