package com;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
//		int a=0;
//		int num [];
//		int num1[] = {10,20,30,40,50};
//		System.out.println(num1);
//		System.out.println(num1[0]);
//		System.out.println(num1[1]);
//		System.out.println(num1[2]);
//		System.out.println(num1[3]);
//		System.out.println(num1[4]);
//		do {
//		System.out.println(num1[a]);
//		a++;
//		}while (a<num1.length);
//		for(int i =0; i<num1.length;i++) {
//			System.out.println("Array value is "+num1[i]);
//		}
		
//		int abc[]= new int[10];
//		System.out.println(abc[0]);
//		System.out.println(abc[9]);
//		//System.out.println(abc[10]);
//		System.out.println("Size of array "+abc.length);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers?");
		int size =sc.nextInt();
		int data[]=new int[size];
		int s=0;
		int pares=0;
		int impares = 0;
		System.out.println("Pls enter the number one by one");
		for(int i=0;i<data.length;i++) {
			
			data[i]=sc.nextInt();
		}
		for(int i=0;i<data.length;i++) {
			s = s + data[i];
			if (data[i]%2==0) {
				pares = pares + data[i];
			}else {
				impares = impares+data[i];
			}
		}
		System.out.println("the sum is "+s);
		System.out.println("the sum of odds "+impares);
		System.out.println("the sum of evens "+pares);
	sc.close();
	}
	
}
