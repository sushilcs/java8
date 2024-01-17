package com.sk.gfgProblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?page=2&category=Arrays&difficulty=Easy&sortBy=submissions
/*
 * Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find 
 * all pairs from both arrays whose sum is equal to X.
Note: All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then
(u1,v1) should be printed first else second.
Input:
A[] = {1, 2, 4, 5, 7}
B[] = {5, 6, 3, 4, 8} 
X = 9 
Output: 
1 8
4 5 
5 4
Explanation:
(1, 8), (4, 5), (5, 4) are the
pairs which sum to 9.
 */

public class problem9 {

	public static void main(String[] args) {
      long A []= {1, 2, 4, 5, 7};
      long B []= {5, 6, 3, 4, 8} ;
      long sum =9;
      Arrays.sort(A);
      List<Long>listA = new ArrayList<>();
      for(int i=0;i<A.length;i++) {
    	  listA.add(sum-A[i]);
      }
      List<Long>listB = new ArrayList<>();
      for(int i=0;i<B.length;i++) {
    	  listB.add(B[i]);
      }
      //Collections.sort(list);
      //Map<Long,Long>hashMap = new TreeMap<>();
      List<Pair>pairs = new ArrayList<>();
     for(long l : listA) {
    	 if(listB.contains(l)) {
    		 pairs.add(new Pair(A[listA.indexOf(l)],B[listB.indexOf(l)]));
    	 }
     }
     System.out.println(pairs);
      
	}

}
