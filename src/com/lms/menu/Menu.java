package com.lms.menu;

import java.util.Scanner;

public class Menu {
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("Enter your choice");
		
		return sc.nextInt();
		
	}

}
