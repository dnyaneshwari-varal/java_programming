package MyPackage;

public class Swap_Date {
	private int day;
	private int month;
	private int year;
	
	
	public Swap_Date()
	{
		day=1;
		month=1;
		year=2016;
	}
	public Swap_Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	
	public void printdate() {
		System.out.println("Date is "+ day+ "/" +month + "/"+year);
	}
	
	public String toString() {
		return day + "-" +month +"-" +"-"+year;
	}
	public static void main(String[] args) {
		
		Swap_Date d1=new Swap_Date();
		System.out.println(d1);
		
		Swap_Date d2=new Swap_Date(12,3,2014);
		System.out.println(d2);
		d2.printdate();
		
		String str=d2.toString();
		System.out.println(str);

	}

}
