package com.simeio.autowiring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.simeio.autowiring");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		Performer performer = context.getBean("performer", Performer.class);
		performer.playSong("piano", "Final Word");
		performer.playSong("violin", "Firework");
		performer.playSong("guitar", "With or Without You");
	}

}
