package com.oops.streams;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Addition {
	public static void main(String[] args) {
		System.out.println("------------Consumer------------");
		Consumer<Integer> consumer = (number) -> System.out.println(number + number);
		consumer.accept(3);

		System.out.println("------------BiConsumer------------");
		BiConsumer<Integer, Integer> bicon = (number1, number2) -> {
			System.out.println("Addition " + (number1 + number2));
		};
		bicon.accept(6, 6);
		
	}
}
