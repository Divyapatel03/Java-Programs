package com.oops.basics;

public class SmallestInArray {
	public static void main(String[] args) {
		int[] arr= {10,20,5,40,50};
		
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(small>arr[i])
				small=arr[i];
		}
		System.out.println("The greatest number in array :"+small);
}
}
