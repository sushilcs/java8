package com.sk.java8.PFI.predefinedFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * public interface Predicate<T>
 * {
 *   public boolean test(T);
 *   }
 */

public class PredicateExample {
	
	public static void main(String args[]) 
	{
		/*
		 * List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 * Predicate<Integer>p=x->x%2==0;
		 * List<Integer>filteredlist=list.stream().filter(p).collect(Collectors.toList()
		 * ); System.out.println(filteredlist); //predicate().and()
		 * 
		 * //=====================================================================
		 * List<Integer>list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 * Predicate<Integer>p1=x->x%2==0; Predicate<Integer>p2=x->x>4;
		 * List<Integer>filteredlist1=list.stream().filter(p1.and(p2)).collect(
		 * Collectors.toList()); System.out.println(filteredlist); //predicate().or()
		 * 
		 * //===========================================================================
		 * =
		 * 
		 * List<Integer>list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 * Predicate<Integer>p3=x->x%2==0; Predicate<Integer>p4=x->x>4;
		 * List<Integer>filteredlist2=list.stream().filter(p1.or(p2)).collect(Collectors
		 * .toList()); System.out.println(filteredlist);
		 */
		//predicate().negate()
		
		//==============================================================================================
		
		List<String>list3 = Arrays.asList("a","cdb","agp","dagp");
		Predicate<String>p5=x->x.startsWith("a");
		List<String>filteredlist3=list3.stream().filter(p5.negate()).collect(Collectors.toList());
		System.out.println(filteredlist3);
	
	}

}
