package com.java.core.returnobject;

import java.util.Scanner;

public class CreateNewBook {
	
	Scanner sc = new Scanner(System.in);
  
	public Book CreateBook() {
		
		System.out.println("Enter the Book Details");
		System.out.println("*********************");
		
		System.out.println("Enter the Title :");
		String t = sc.next();
		
		System.out.println("Enter Author Name :");
		String a = sc.next();
		
		System.out.println("Enter Book Price :");
		double p = sc.nextDouble();
		
		return new Book(t,a,p);
	  
  }
}
