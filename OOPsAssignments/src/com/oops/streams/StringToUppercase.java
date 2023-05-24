package com.oops.streams;

import java.util.function.Supplier;

public class StringToUppercase {
	public static void main(String[] args) {
		System.out.println("=================Supplier=============");
		Supplier<String> sup = () -> "Hello".toUpperCase();
		System.out.println(sup.get());
	}
}
