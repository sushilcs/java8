package com.sk.gfgProblems.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem24 {
	/*
	 * https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
	 * Given a word pat and a text txt. Return the count
	 *  of the occurrences of anagrams of the word in the text.
	 */
	
	// this solution exceeds time limit 

	public static void main(String[] args) {
		
		String txt = "forxxorfxdofr";
		String pat = "for";
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character,Integer>map2 = new HashMap<>();
		int start = 0;
		int end = 0;
		int count =0;
		
		for(int i = 0;i<pat.length();i++) {
			char c = pat.charAt(i);
			if(map2.containsKey(c)) {
				map2.put(c,map2.get(c)+1);
			}
			else {
				map2.put(c, 1);
			}
		}
		while(end<txt.length()) {
			//list.add(txt.charAt(end));
			char c = txt.charAt(end);
	        if(map1.containsKey(c)) {
	        	map1.put(c, map1.get(c)+1);
	        }
	        else {
	        	map1.put(c, 1);
	        }
			
			if(end-start+1==pat.length()) {
				if(map1.equals(map2)) {
					count++;
				}
				if(map1.get(txt.charAt(start))==1){
					map1.remove(txt.charAt(start));
				}
				else {
					map1.put(txt.charAt(start), map1.get(txt.charAt(start))-1);
				}
				start++;
			}
			end++;
			
		}
		System.out.println(count);
		

	}

}
