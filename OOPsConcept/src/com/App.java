package com;

public class App {

	public static void main(String[] args) {
		Car innova = new Car();		
		innova.start();
		innova.stop();
		Car bmw = new Car();
		bmw.wheel= 16;
		bmw.colour = "black";
		bmw.price = 15000.50;
		System.out.println("Bmw wheel is "+bmw.wheel);
		System.out.println("Bmw colour is "+bmw.colour);
		System.out.println("Bmw price is "+bmw.price);
		System.out.println("Innova Car details");
		innova.wheel=4;	// set the value
		innova.colour="Gray";
		innova.price=3500000;
		System.out.println("Wheel "+innova.wheel);
		System.out.println("Colour "+innova.colour);
		System.out.println("Price "+innova.price);
	}

}
