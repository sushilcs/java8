package com.sk.gfgProblems.arrays;

import java.util.HashSet;

/*
 * Given an array Arr of N positive integers and another number X.
 *  Determine whether or not there exist two 
 *https://www.geeksforgeeks.org/problems/key-pair5616/1?itm_source=geeksforgeeks&itm_medium=
 *article&itm_campaign=bottom_sticky_on_article
 * elements in Arr whose sum is exactly X.
 */

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
 */
public class Problem10 {

	public static void main(String[] args) {
		int arr[] = {1,45,6,10,8};
		int x=16;
		HashSet<Integer> s= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int temp=x-arr[i];
            if(s.contains(temp)){
                System.out.println("yes");
                return ;
            }
            else{
                s.add(arr[i]);
            }
        }
        System.out.println("no");
        

 }
}
