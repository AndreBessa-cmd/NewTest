package com.bean;

public class Manager extends Employee{
	
	public void managerInfo() {
//		System.out.println(" id "+id); // private : scope same class
		System.out.println(" name "+name);
		System.out.println(" salary "+salary);
		System.out.println(" designation "+designation);
	}

}
