package com.java.core.returnobject;

public class Book {
	String title;
	String author;
	double price;
	
	Book(String t,String a, double p){
		title = t;
		author = a;
		price = p;
	}
	
	void Display() {
		System.out.println("Book Details");
		System.out.println("-------------------");
		
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}

}
