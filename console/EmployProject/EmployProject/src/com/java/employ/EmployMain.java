package com.java.employ;

import java.util.Scanner;

public class EmployMain {
	
	static EmployBAL bal;
	static Scanner sc;
	
	static {
		bal = new EmployBAL();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("OPTION");
			System.out.println("----------");
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Sreach Employ");
			System.out.println("4. Delete Employ");
			System.out.println("5. Update Employ");
			System.out.println("6. Exit");
			System.out.println("7. WriteEmploy File");
			System.out.println("8. Read Employ File");
			System.out.println("Enter Your Choice ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				
				addEmployMain();
			}
		
		}
	}

	private static void addEmployMain() {
		// TODO Auto-generated method stub
		
	}

}
