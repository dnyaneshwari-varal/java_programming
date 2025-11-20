package Assignments;


public class MyDate {
	
	int day=30;
	int month=6;
	int year=2011;
	public void initDate() {
		System.out.println("Date is: "+ day+"/"+month+"/"+year);
	}
	

	public static void main(String[] args) {
		
		MyDate d=new MyDate();
		
		//System.out.println(d.day);
		d.initDate();
		
		
		
	}

}