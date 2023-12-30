package com.sk.java8.PFI.predefinedFunctionalInterfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
/*
 * Consumer is also a functional interface with a abstract method accept
 * it takes an argument and doesn't return anything.
 */
public class ConsumerExample {
  public static void main(String args[]) {
	  Consumer<Integer>consumer = x->System.out.println(x);
	  consumer.accept(3);
	  Book book1 = new Book("physics",300.05);
	  Book book2 = new Book("Chemistry",450.40);
	  List<Book>booklist = new ArrayList<>();
	  booklist.add(book1);
	  booklist.add(book2);
	  //booklist.forEach(x->System.out.print(x.getName().toUpperCase()+"instruction\\nto\\nstaff"));
	  String str=getString();
	  System.out.println(str);
	  
  }

private static String getString() {
	// TODO Auto-generated method stub
	return "instruction\nstaff";
}
}
