package MyPackage;

public class MyDate {
	
	private int day,month,year;
	
		MyDate()
		{
			day=0;
			month=0;
			year=0;
		}
	public void initDate() {
		day=30;
		month=6;
		year=2011;
	}
	public void printDate() {
		System.out.println("Date is: "+ day+"/"+month+"/"+year);
		}

	public static void main(String[] args) {
		
		MyDate d=new MyDate();
		d.printDate();
		//System.out.println(d.day);
		d.initDate();
		d.printDate();
		
		
	}

}
