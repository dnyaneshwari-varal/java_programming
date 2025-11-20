package MyPackage;

public class Calculator {
	public void add(int x,int y) {
		int add=x+y;
		System.out.println("Addition of x=" +x +" and y="+y +" is "+add);
	}
	public void sub(int x,int y) {
		int sub=x-y;
		System.out.println("substraction of x=" +x +" and y="+y +" is "+sub);
	}
	public void mult(int x,int y) {
		int mul=x*y;
		System.out.println("Multiplication of x=" +x +" and y="+y +" is "+mul);
	}
	public void div(int x,int y) {
		int div=x/y;
		System.out.println("Division of x=" +x +" and y="+y +"is "+div);
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(12,9); //21
		c.sub(10,5); //5
		c.mult(12, 2); //24
		c.div(14,2); //7
				
		

	}

}
