package MyPackage;

class Customer{
	private String name="Dnyaneshwari";
	private int age=22;
	private int C_id=12367;
	private String gender="Female";
	
	public void setName(String n) {
		name=n;
		
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age=a;
		
	}
	public int getAge() {
		return age;
	}
	
	public void setCust(int Cid) {
		C_id=Cid;
		
	}
	public int getCust() {
		return C_id;
	}
	
	public void setGender(String g) {
		gender=g;
		
	}
	public String getGender() {
		return gender;
	}
}

public class Customer_getSet {
	
  public static void main(String[] args) {
	Customer obj = new Customer();
	System.out.println("name is "+obj.getName());
	System.out.println("Age is "+obj.getAge());
	System.out.println("Customer ID is "+obj.getCust());
	System.out.println("Gender is "+obj.getGender());
  }
}
