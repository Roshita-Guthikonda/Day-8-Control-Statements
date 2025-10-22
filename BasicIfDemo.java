package com.codegnan.controlstatements;

import java.util.Scanner;

public class BasicIfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int number=sc.nextInt();
		//if syntax
		if(number>0) {
			System.out.println("The Number " + number + " is positive");
		}
		else {
			System.out.println("The Number " + number + " is negative");
		}
		System.out.println("This statement always execute");
		sc.close();

	}

}
