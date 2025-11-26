package Method_HW;

public class EvenOdd {
	public  void evenOdd(int num) {
		if(num%2==0) {
			System.out.println(num +" is Even number");
		}
		else {
			System.out.println(num +" is Odd number");
		}
		
	}

	public static void main(String[] args) {
		
		EvenOdd obj=new EvenOdd();
		obj.evenOdd(5);
		
	}

}
