package MyPackage;

public class constructor_overload {
	
	private int day,month,year;
	constructor_overload(){ //default constructor
		day=1;
		month=01;
		year=2004;
		System.out.println("In default constructor!");
		System.out.println();
	}
	
	constructor_overload(int d,int m,int y){ //parameterized constructor
		day=d;
		month=m;
		year=y;
		System.out.println("In default constructor!");
	}


	public static void main(String[] args) {
		constructor_overload obj=new  constructor_overload();
		constructor_overload obj1=new  constructor_overload(9,07,2005);

	}

}
