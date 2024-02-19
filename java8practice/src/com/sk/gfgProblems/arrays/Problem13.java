package com.sk.gfgProblems.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.*;

/*
 * https://www.geeksforgeeks.org/problems/
 * non-repeating-character-1587115620/1?page=2&difficulty=
 * Easy&status=unsolved&sortBy=submissions
 */
public class Problem13 {

	public static void main(String[] args) {
		String S = "zxvcczbbtxyzvy";
		Map<Character,Integer>map = new LinkedHashMap<>();
		for(int i=0;i<S.length();i++) {
			if(map.containsKey(S.charAt(i))) {
			  map.put(S.charAt(i), map.get(S.charAt(i))+1);
			}
			else {
				map.put(S.charAt(i), 1);
			}
		}
		for(int i=0;i<S.length();i++){
			if(map.containsKey(S.charAt(i))&& map.get(S.charAt(i))==1) {
				System.out.println(S.charAt(i));
				return ;
			}
		}
		System.out.println("$");
		

	}

}
