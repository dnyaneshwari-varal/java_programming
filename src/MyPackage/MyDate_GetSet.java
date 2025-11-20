package MyPackage;

public class MyDate_GetSet {
	private int day,month,year;
	
	public void setMonth(int m) {
		month=m;
	}
	public int getMonth() {
		return month;
		
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
		
		MyDate_GetSet obj=new MyDate_GetSet();
		obj.setMonth(12);
		System.out.println(obj.getMonth());
//		System.out.println(obj.month);//0 bcoz month is private
		

	}

}
