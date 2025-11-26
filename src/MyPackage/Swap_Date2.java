package MyPackage;

public class Swap_Date2 {
	
	public static void swap(Swap_Date d1,Swap_Date d2) {
		
		Swap_Date temp;
		temp=d1;
		d1=d2;
		d2=temp;
		System.out.println("\t\t\t\t Inside swap function: ");
		System.out.println("\t\t\t\t d1 object is "+d1);
		System.out.println("\t\t\t\t d2 object is "+d2);
	}
	
	
	

	public static void main(String[] args) {
		Swap_Date d1=new Swap_Date();
		Swap_Date d2=new Swap_Date(11,1,2004);
		
		
		System.out.println(" before swapping: ");
		System.out.println(" d1 object is "+d1);
		System.out.println(" d2 object is "+d2);
		
		Swap_Date2.swap(d1,d2); //here copy of reference obj send to swap method
		
		System.out.println("after swapping: ");
		System.out.println("d1 object is "+d1);
		System.out.println("d2 object is "+d2);
		

		

	}

}
