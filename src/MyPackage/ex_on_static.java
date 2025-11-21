package MyPackage;

public class ex_on_static {
	int x=8;
	static float interesRate;
	static{
		interesRate=20;
	}
	static public float getInterestRate() {
//		ex_on_static obj=new ex_on_static();
//		System.out.println(obj.x); by this you can acces instance variable
		return interesRate;
		
	}
	
	public static void main(String[] args) {
//		ex_on_static obj=new ex_on_static();
	// TODO Auto-generated method stub
		
		
		
	}

}
