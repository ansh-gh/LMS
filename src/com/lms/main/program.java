package com.lms.main;

import com.lms.menu.*;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		while ((choice = Menu.menu(sc))!=0) {
			switch (choice) {
			case 1:
				System.out.println("Addition will  happen");
				break;
			case 2:
				int i;
				while ((i = multiply_menu.menu(sc)) != 0) {
					switch (i) {
					case 1:
						System.out.println("multiply will happen");
						break;
						case 3:
					System.out.println("Division will happen");
					
					break;

					default:
						break;
					}
					
				}
				break;
				

			default:
				break;
			}
			
		}

	}

}
