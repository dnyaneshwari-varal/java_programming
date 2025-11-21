package Assignments;

public class lab_ex6_Employee {
	static int count=0;
	static int employeeID;
	static String name;
	static double basic_salary;
	
	lab_ex6_Employee(){
		count++;
	}
	
	static void totalEmployee(){
		System.out.println("Total employees are: "+count);
	}

	public static void main(String[] args) {
		
		 lab_ex6_Employee obj=new  lab_ex6_Employee();
		 totalEmployee();
	}

}
