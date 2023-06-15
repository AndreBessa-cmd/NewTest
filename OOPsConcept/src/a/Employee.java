package a;

public class Employee {
	private int id;
	private String name;
	private float salary;
	
	//empty constructor
	Employee()  {   //initialization
		id = 123;    //stabilish default values
		name ="Unknown";
		salary = 5000;
			System.out.println("Object created...");	
			
	}
	
	
	
	//parameter constructor
	Employee (int id1,String name1, float salary1) {   //local variable
		id=id1;
		name=name1;
//		salary=salary1;
		if(salary1<0) {
			salary=8000;
		}else {
			salary=salary1;
		}
		
	}
	void setValue (int id1,String name1, float salary1) {   //local variable
		id=id1;
		name=name1;
		if(salary1<0) {
			salary=8000;
		}else {
			salary=salary1;
		}		
	}
	void display () {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		}
	
//	Manager extends Employee {
//		S
//	}
}
