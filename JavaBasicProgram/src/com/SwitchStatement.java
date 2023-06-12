package com;

public class SwitchStatement {

	public static void main(String[] args) {
		int choice = 1;
		switch (choice) {
		case 1: System.out.println("1st block");
		break;
		case 2: System.out.println("2st block");
		break;
		case 3: System.out.println("3st block");
		break;
		case 4: System.out.println("4st block");
		break;
		default : System.out.println("Wrong block");
		break;
		}
		System.out.println("Finish");
	}

}
