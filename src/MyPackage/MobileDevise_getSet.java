package MyPackage;


class MobileDevice {
	private String color="black";
	private int price=15000;
	private String name="Vivo";
	private String os="FunTouch";
	
	public void setColor(String c){
		color=c;
	}
	public String getColor() {
		return color;
	}
	
	public void setPrice(int p){
		price=p;
	}
	public int getPrice() {
		return price;
	}
	
	
	public void setName(String n){
		name=n;
	}
	public String getName() {
		return name;
	}
	
	
	public void setOS(String o){
		os=o;
	}
	public String getOS() {
		return os;
	}
	
	
	 
	public static void main(String[] args) {
//		MobileDevice obj=new MobileDevice();
//		System.out.println(obj.color);
		

	}

}
public class MobileDevise_getSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDevice obj1=new MobileDevice();
//		System.out.println(obj1.color);
//		obj1.setColor("blue"); if we want actuall value then no need to call setColor
		System.out.println("Color is : "+obj1.getColor());
		System.out.println("price is : "+obj1.getPrice());
		System.out.println("name is : "+obj1.getName());
		System.out.println("os is : "+obj1.getOS());
	}

}
 