package com.sk.gfgProblems.arrays;

import java.util.Stack;
/*
 * https://www.geeksforgeeks.org/explore?page=1&sortBy=submissions&itm_source=
 * geeksforgeeks&itm_medium=main_header&itm_campaign=practice_header
 * 
 */

public class Problem28 {

	public static void main(String[] args) {
		String x = ")({}][";
        int n = x.length();
        Stack<Character> stack = new Stack<>();
      
        for(int i =0;i<n;i++){
            char c = x.charAt(i);
            if(c=='{'||c=='['||c=='(')
            stack.push(c);
            else if(c=='}') {
            	if(!stack.isEmpty()&&stack.peek()=='{')
            		stack.pop();
            	else
            	{
            		System.out.println("false");
            		return ;
            	}
            }
            else if(c==']') {
            	if(!stack.isEmpty()&&stack.peek()=='[')
            		stack.pop();
            	else
            	{
            		System.out.println("false");
            		return ;
            	}
            }
            else if(c==')') {
            	if(!stack.isEmpty()&&stack.peek()=='('){
            		stack.pop();
            	}
            	else
            	{
            		System.out.println("false");
            		return ;
            	}
            }
           

        }
        if(!stack.isEmpty()&& !x.isEmpty()) {
        	System.out.println("false");
        	return ;
        }
        
        System.out.println(stack.isEmpty());


	}

}
