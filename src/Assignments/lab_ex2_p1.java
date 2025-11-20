//Create an object and initialize it using mutator methods (setters) and access it using accessor methods (getters). Print the date.
package Assignments;

public class lab_ex2_p1 {
	private int date;
	private int month;
	private int year;
	
	public void setDay(int d) {
		date=d;
	}
	public int getDay() {
		return date;
	}
	public void setMonth(int m) {
		month=m;
	}
	public int getMonth() {
		return month;
	}
	public void setYear(int y) {
		year=y;
	}
	public int getYear() {
		return year;
	}
	
	
	
	public static void main(String[]args) {
		lab_ex2_p1 obj=new lab_ex2_p1();
		obj.setDay(10);
		obj.setMonth(2);
		obj.setYear(2025);
		System.out.println(obj.getDay() +"/" +obj.getMonth() +"/" +obj.getYear());
	}

}
