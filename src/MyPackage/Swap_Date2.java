//package MyPackage;
//
//public class Swap_Date2 {
//	
//	public static void swap(dateArray arr,dateArray[1]) {
//		
//		Swap_Date temp;
//		temp=d1;
//		d1=d2;
//		d2=temp;
//		System.out.println("\t\t\t\t Inside swap function: ");
//		System.out.println("\t\t\t\t d1 object is "+d1);
//		System.out.println("\t\t\t\t d2 object is "+d2);
//	}
//	
//	
//	
//
//	public static void main(String[] args) {
//		Swap_Date d1=new Swap_Date();
//		Swap_Date d2=new Swap_Date(11,1,2004);
//		
//		
//		System.out.println(" before swapping: ");
//		System.out.println(" d1 object is "+d1);
//		System.out.println(" d2 object is "+d2);
//		
//		Swap_Date2.swap(d1,d2); //here copy of reference obj send to swap method
//		
//		System.out.println("after swapping: ");
//		System.out.println("d1 object is "+d1);
//		System.out.println("d2 object is "+d2);
//		
//		

//
//		
//
//	}
//
//}


package MyPackage;

public class Swap_Date2 {

   
    public static void swap(Swap_Date[] arr, int i, int j) {
        Swap_Date temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        
        System.out.println("\nArray of Swap_Date objects:");

        Swap_Date[] dateArray = new Swap_Date[2];

        dateArray[0] = new Swap_Date();               
        dateArray[1] = new Swap_Date(11, 1, 2004);    
//        dateArray[2] = new Swap_Date(25, 12, 2023);   

        // Printing before array swap
        System.out.println("\nBefore array swap:");
//        for (int i = 0; i < dateArray.length; i++) {
//            System.out.println("Date " + (i + 1) + ": " + dateArray[i]);
//        }
        //or
        
        System.out.println(dateArray[0]);
        System.out.println(dateArray[1]);

        
        swap(dateArray, 0, 1);

        // Printing after array swap
        System.out.println("\nAfter array swap:");
//        for (int i = 0; i < dateArray.length; i++) {
//            System.out.println("Date " + (i + 1) + ": " + dateArray[i]);
//        }
//        
//        System.out.println();
        
        //or
        System.out.println(dateArray);
        System.out.println(dateArray[0]);
        System.out.println(dateArray[1]);
        System.out.println(System.identityHashCode(dateArray[1]));

        
        
    }
}

