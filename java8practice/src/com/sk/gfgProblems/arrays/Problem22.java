package com.sk.gfgProblems.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Given a string S, find the length of the longest substring without repeating characters.
 * https://www.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1
 */

public class Problem22 {

	public static void main(String[] args) {
		// TLE in gfg
		
		/*
		 * String s = "qwerty"; int n = s.length(); int startWindow = 0; int maxLen =
		 * Integer.MIN_VALUE; Map<Character,Integer> map = new LinkedHashMap<>();
		 * for(int i = 0 ;i< n; i++) { char c = s.charAt(i); if(map.containsKey(c)) {
		 * map.put(c, map.get(c)+1); } else { map.put(c, 1); } if(map.get(c)==1) {
		 * maxLen = Math.max(maxLen, i-startWindow+1); } while(map.get(c)!=1) { char c1
		 * = s.charAt(startWindow); map.put(c1,map.get(c1)-1); if(map.get(c1)==0) {
		 * map.remove(c1); } startWindow++; } } System.out.println(maxLen+" "+map);
		 */
		String s = "abcdhcbayr";
		int n = s.length();

        long maxLen = Long.MIN_VALUE;
        Map<Character, Integer> windowCharCount = new HashMap<>(); 
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < n; windowEnd++) {
            
            char c = s.charAt(windowEnd);
            windowCharCount.put(c, windowCharCount.getOrDefault(c, 0) + 1);
            while(windowCharCount.size() < windowEnd-windowStart+1) {
                char leftChar = s.charAt(windowStart);

  
                windowCharCount.put(leftChar, windowCharCount.get(leftChar) - 1);
                if(windowCharCount.get(leftChar) == 0) {
                    windowCharCount.remove(leftChar);
                }

                windowStart++;               
            }

            if(windowCharCount.size() == windowEnd-windowStart+1) {
                maxLen = Math.max(maxLen, windowEnd-windowStart+1);
            }
        }

        System.out.println(maxLen); ;

	}

}
