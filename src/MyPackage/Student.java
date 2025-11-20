package MyPackage;

public class Student {
	private int rollNo;
	String name;
	double percentage;
	public void setRollNo(int roll) {
		rollNo=roll;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void initStudent() {
	    rollNo=12;
		name="Dnyaneshwari";
		percentage=87.20;
		
		
	}
	public void printDetails() {
		System.out.println("Roll no: "+rollNo +" Name: "+name +" Percentage: "+percentage +"%");
	}
	

	public static void main(String[] args) {
	
//		Student std=new Student();
//		std.initStudent();
//		std.printDetails();
		//System.out.println(std.rollNo);//0 bcoz rooNo is private var in class
//		System.out.println(std.getRollNo());
		

	}

}


