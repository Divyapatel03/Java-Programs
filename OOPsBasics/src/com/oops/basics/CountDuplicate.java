package com.oops.basics;

public class CountDuplicate {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 45, 12 };
		boolean rs[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (rs[i] == false) {
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == arr[i]) {
						count++;
						rs[j] = true;
					}
				}
				if (count > 1)
					System.out.println(arr[i] + " => " + count);
			}
		}
	}
}
