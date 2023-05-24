package com.oops.basics;

public class GreatestNoInArray {
	public static void main(String[] args) {
		int[] arr= {10,20,300,40,50};
		
		int big=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(big<arr[i])
				big=arr[i];
		}
		System.out.println("The greatest number in array :"+big);
}
}