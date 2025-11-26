package Method_HW;

public class Celsius_Fahrenheit {
	
	public double cel_fah(int C) {
		double F=(C*(9.0/5)+32);
		return F;

	}
	public static void main(String[] args) {
		int C=90;
		System.out.println("In celsious: "+C);
		Celsius_Fahrenheit obj =new Celsius_Fahrenheit();
		double F=obj.cel_fah(C);
		System.out.println("In Fahrenheit: "+F);

	}

}
