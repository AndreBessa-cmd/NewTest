package com.entity;
import com.bean.Employee;

public class Developer extends Employee{
	public void devInfo() {
//		System.out.println(" id "+id); // private : scope same class
//		System.out.println(" name "+name); // default: scope: same package
		System.out.println(" salary "+salary);
		System.out.println(" designation "+designation);
	}
}
