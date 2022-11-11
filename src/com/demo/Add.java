package com.demo;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers to add:");
		int a= sc.nextInt();
		int b= sc. nextInt();
		int sum=a+b;
		System.out.println("sum ="+ sum);
		
	}
	
}




