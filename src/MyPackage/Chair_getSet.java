package MyPackage;

class Chair {
	
	
	private String color;
	private int price;
	private String type;
	private String material;
	public Chair() {
		color="White";
		price=200;
		type="office chair";
		material="wood";
	}
	
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
	
	
	public void setMaterial(String m){
		material=m;
	}
	public String getMaterial() {
		return material;
	}
	
	
	public void setType(String t){
		type=t;
	}
	public String getType() {
		return type;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

public class Chair_getSet {

	public static void main(String[] args) {
		Chair c= new Chair();
		//its give default value which i initialize in constructor in constructor
		//when i don't set value then by default constructor value will print
		System.out.println("values that i initialize in constructor(bydefault): "+c.getColor()+" "+c.getPrice()+ " "+c.getMaterial() +" "+c.getType());
		
		Chair obj=new Chair();
//		System.out.println(obj.getColor());
		obj.setColor("Pink");
		System.out.println("Color is : "+obj.getColor());
		obj.setPrice(1200);
		System.out.println("price is : "+obj.getPrice());
		obj.setMaterial("plastic");
		System.out.println("material is : "+obj.getMaterial());
		obj.setType("Room");
		System.out.println("type is : "+obj.getType());

	}

}
