package com.lms.menu;

import java.util.Scanner;

public class multiply_menu {
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. multiply two numbers");
		System.out.println("2. multiply three numbers");
		System.out.println("Enter your choice");
		return sc.nextInt();
	}

}
