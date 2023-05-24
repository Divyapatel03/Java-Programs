package com.oops.streams;

import java.util.function.BiConsumer;

public class Demo {
	public static void main(String[] args) {
		BiConsumer<String, Integer> bicon1 = (name, age) -> {
			if (name.equals("Admin") && age > 30)
				System.out.println("Welcome " + name);
			else
				System.out.println("wrong user");

		};
		bicon1.accept("Admin", 31);
	}
}
