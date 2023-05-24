package com.oops.objbasics;

public class Student {
	String name;
	String department;

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void getDetails() {
		System.out.println("Name of Student :" + name);
		System.out.println("Department of Student :" + department);
		System.out.println();
	}

	String getGrades(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		System.out.println("The sum is " + sum);
		int avg = sum / marks.length;
		System.out.println("The average is " + avg);
		if (avg > 90)
			return "A";
		else if (avg > 70 && avg <= 90)
			return "B";
		else if(avg >50 && avg<=70)
			return "C";
		else
			return "D";
	}
}
