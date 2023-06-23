package com;

public class RunTimeError {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b =0;
		try {
		int res = a/b;
		System.out.println("resulit is "+res);
		}catch(Exception e) {
//			System.out.println("I take care!");
//			System.out.println(e.getMessage()); // exception message in short
//			System.out.println(e.toString()); // display name of exception
			e.printStackTrace();  // display name as well as line
		}
		System.out.println("Bye");

	}

}
