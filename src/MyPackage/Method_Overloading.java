package MyPackage;

public class Method_Overloading {
	
	public void add(int x,int y) {
		System.out.println("in 1st add method");
		int add=x+y;
		System.out.println("addition is: "+ add );
	}
	
	public void add(float a,int b) {
		System.out.println("in 2nd add method");
		float add1=a+b;
		System.out.println("addition is: "+ add1 );
	}

	public static void main(String[] args) {
		Method_Overloading obj= new Method_Overloading();
		obj.add(1,2);
		
	}

}

//try this
class Overload{
	public void add(int x,float y) {
		System.out.println("addition is: "+ (x+y));
	}
	public float add( float y) {
		return y;
	}
	public static void main(String []args) {
		Overload o=new Overload();
		o.add(10,20.0f);
	}
}
