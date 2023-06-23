package com.bean;

public class Employee {
	
	private int id;  //scope: same class
	String name; // scope: same package
	protected float salary; // protected can't access if not a subclass
	public String designation;
	
	public void empInfo() {
		System.out.println(" id "+id);
		System.out.println(" name "+name);
		System.out.println(" salary "+salary);
		System.out.println(" designation "+designation);
	}

}
