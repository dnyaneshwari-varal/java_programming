//2. Write a class Customer and count no of customer objects and print 
//no of customers before and after creating 3 objects of customer.

package MyPackage;

public class Static_HW2 {
	static int count=0;
	int empID;
	String name;
	float salary;
	
	Static_HW2(String n,float s ){
		count++;
		name=n;
		salary=s;
		empID=count;
//		System.out.println("EmployeeId: "+empID +" NAME: "+name+ "Salary: "+salary);
			
	}

	
	
	

	public static void main(String[] args) {
		
		System.out.println("Before creating obj count of customer: "+count);
		
		Static_HW2 obj=new Static_HW2("Shivani",56000);
		Static_HW2 obj1=new Static_HW2("isha",87654);
		Static_HW2 obj2=new Static_HW2("prem",73456);
		System.out.println("After creating obj count of customer: "+count);
		
		
	}

}
