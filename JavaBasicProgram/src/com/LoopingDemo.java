package com;

public class LoopingDemo {

	public static void main(String[] args) {
		System.out.println("While loop");
		int i=1, n=10;
//		while(i<=n)
//		{
//			System.out.println("Value of i is "+i);
//			i++;
//		}
//		System.out.println("Finish");
//	}
		do {
			System.out.println("Value of i is "+i);
			i++;
		}while(i<=n);
		System.out.println("Finish");
	}
}
