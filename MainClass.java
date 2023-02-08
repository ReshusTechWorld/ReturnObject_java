package com.java.core.returnobject;

public class MainClass {

	public static void main(String[] args) {
		
		CreateNewBook b = new CreateNewBook();
		Book b1 = b.CreateBook();
		b1.Display();

	}

}
