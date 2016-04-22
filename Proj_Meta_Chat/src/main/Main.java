package main;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner;
	private static boolean access;

	public static boolean isAccess() {
		return access;
	}

	public static void setAccess(boolean access) {
		Main.access = access;
	}

	public static void main(String[] args) {
	setAccess(false);
	String login;
	System.out.println("login:");
		scanner = new Scanner(System.in);
		login = scanner.nextLine();

			if (login == "Andeh") {
				System.out.println("Verified!");
				setAccess(true);
			}
			else{
				System.out.println("!False Login!");
				System.out.println("Login:");
				
				
				
			}
				
		}
			
}