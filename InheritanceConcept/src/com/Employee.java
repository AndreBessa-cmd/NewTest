package com;

public class Employee {
	private int id;
	private String name;
	private float salary;
	
	void setEmployee(int id, String name, float salary) {
		this.id =id;
		this.name = name;
		this.salary= salary;
	}
	
	void disEmployee() {
//		System.out.println("Employee details");
		System.out.println("ID is "+this.id);
		System.out.println("name is "+this.name);
		System.out.println("salar is "+this.salary);
		
	}

}
