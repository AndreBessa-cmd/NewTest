package com;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setEmployee(101, "Raj", 15000);
		System.out.println("Employee Details");
		emp1.disEmployee();
		
		
		Manager man1 =new Manager();
		man1.setEmployee(102, "Akash", 45000);
		man1.setManager(15);
		System.out.println("Manager Details");
		man1.disEmployee();
		man1.disManager();
		
		Developer dev1 = new Developer();
		dev1.setEmployee(102, "Manu", 25000);
		dev1.setDeveloper("Java");
		System.out.println("Developer Details");
	
		dev1.disEmployee();
		dev1.disDeveloper();
		
//		ProjectManager proj1 = new ProjectManager();
//		proj1.disProjM();
//		
//		proj1.disEmployee();
	}

}
