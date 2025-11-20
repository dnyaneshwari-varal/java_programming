package MyPackage;

public class Constructor_Channing {
	int month,date,year;
	
	public Constructor_Channing() {
		this(1);
	}
	public Constructor_Channing(int dd) {
		this(dd,2);
		date=dd;
		
		
	}
	public Constructor_Channing(int dd,int mm) {
		this(dd,mm,2025);
		date=dd;
		month=mm;
		
	}
	public Constructor_Channing(int dd,int mm,int yy) {
		date=dd;
		month=mm;
		year=yy;
		System.out.println(date+"/"+month+"/"+year);
	
	}

	public static void main(String[] args) {
		Constructor_Channing obj=new Constructor_Channing();

	}

}
