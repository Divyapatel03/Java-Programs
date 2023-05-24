package com.oops.objbasics;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		sc.next();
		System.out.println("Enter the total subject:");
		int subject = sc.nextInt();
		System.out.println("Enter the " + subject + " subject marks:");
		int ar[] = new int[subject];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		Student student = new Student("Divya", "computer");
		student.getDetails();
		String grades = student.getGrades(ar);
		System.out.println("Grade is: " + grades);
		System.out.println("------------------------------------");
		
//		Student student1 = new Student("Sonu", "computer");
//		student1.getDetails();
//		grades = student1.getGrades(ar);
//		System.out.println("Grade is: " + grades);
//		System.out.println("------------------------------------");

	}
}
