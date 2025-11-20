package MyPackage;

public class StudentMain{
	public static void main(String[] args) {
		Student std1=new Student();
		std1.initStudent();
		std1.printDetails();
		
		std1.setRollNo(19);
		System.out.println("updated roll is: "+std1.getRollNo());
		
		
	}
	

}
