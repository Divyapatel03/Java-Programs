package com.oops.basics;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 12, 34, 56, 65, 8, 23, 9 };
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		
	}
}
