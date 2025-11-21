//1. Write a class Employee with int empld, String name, float salary as attributes.
//Create 3 objects of employee and print details [Note: empld should be auto generated)
package MyPackage;

public class Static_HW1 
{   
	 static int count=0;
	 int empID;
	 String name;
	 float salary;
	
	
	
	Static_HW1( String n,float s ){
		count++;
		name=n;
		salary=s;
		empID=count;
		System.out.println("EmployeeId: "+empID +" NAME: "+name+ "Salary: "+salary);
		
	}
	
	

	public static void main(String[] args) {
		Static_HW1 obj=new Static_HW1("Shivani",56000);
		Static_HW1 obj1=new Static_HW1("isha",87654);
		Static_HW1 obj2=new Static_HW1("prem",73456);

	}

}
