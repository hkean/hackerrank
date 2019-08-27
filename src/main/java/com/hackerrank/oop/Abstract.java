package com.hackerrank.oop;

import java.util.Scanner;

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	void setTitle(String s) {
		this.title = s;
	}
}

public class Abstract {
	public static void main(String[] args) {
		// Book new_novel=new Book(); Book is abstract; cannot be instantiated
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}
}
