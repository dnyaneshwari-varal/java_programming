//Create two objects — one using no-argument constructor and one using parameterized constructor. Print the date.

package Assignments;

public class lab_ex2_p2 {
	private int day;
    private int month;
    private int year;
    
    //no parameter constructor
	public lab_ex2_p2() {
		day=19;
		month=1;
		year=2004;
	}
	//parameterized constructor
	
	public lab_ex2_p2(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	public void printOutput() {
		System.out.println(day +"/"+month+"/"+year);
	}
	
	

	public static void main(String[] args) {
		
		lab_ex2_p2 obj=new lab_ex2_p2();
		obj.printOutput(); //19/1/2004
		lab_ex2_p2 obj1=new lab_ex2_p2(12,12,2001);
		obj1.printOutput(); //12/12/2001
		

	}

}
