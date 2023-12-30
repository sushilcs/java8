package com.sk.java8.PFI.predefinedFunctionalInterfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierExample {
	private static final DateTimeFormatter dft =
			DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {
		
		Supplier<LocalDateTime>s=()->LocalDateTime.now();
		System.out.println(s.get());
		Supplier<String>s1=()->dft.format(LocalDateTime.now());
		System.out.println(s1.get());

	}

}
