//Create a class MathClass.Write overloaded add() methods to:add two integersadd two floatsjoin (concatenate) two strings

package Assignments;

public class lab_ex3 {
	
	//add 2 integer value
	public int add(int a,int b) {
		int addI=a+b;
		return addI;
		
	}
	//add 2 float value
	public float add(float a,float b) {
		float addF=a+b;
		return addF;
		
	}
	//concate 2 strings
	public String add(String a,String b) {
		String addS=a+b;
		return addS;
		
	}

	public static void main(String[] args) {
		
		lab_ex3 obj=new lab_ex3();
		System.out.println(obj.add(12, 8));//20
		System.out.println(obj.add(12.1f,17.9f)); //30.0
		System.out.println(obj.add("Dnyaneshwari", "Varal"));//DnyaneshwariVaral
	}

}
