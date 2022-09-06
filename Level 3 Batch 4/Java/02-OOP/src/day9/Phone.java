package day9;

public class Phone {
	
	String brand;
	String color;
	int price;
	
	public Phone(String brand, String color, int price) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		
	}
	
	static String shop = "mDrive";
	
	public void call() {
		System.out.println("This is phone calling method.");
	}
	
	public void sendSms() {
		System.out.println("This is sending sms method.");
	}

	public static void main(String[] args) {
		
		Phone obj = new Phone("iPhone", "Pink", 3100000);
		
		Phone obj2 = new Phone("Samsung", "Purple", 3333000);
		
		System.out.println("----- Object 1 data -----");
		System.out.println("Brand : " + obj.brand);
		System.out.println("Color : " + obj.color);
		System.out.println("Price : " + obj.price + " MMks");
		obj.call();
		obj.sendSms();
		System.out.println("Shop : " + Phone.shop + "\n\n");
		
		Phone.shop = "iSure";
		System.out.println("----- Object 2 data -----");
		System.out.println("Brand : " + obj2.brand);
		System.out.println("Color : " + obj2.color);
		System.out.println("Price : " + obj2.price + " MMks");
		System.out.println("Shop : " + Phone.shop);
		obj2.call();
		obj2.sendSms();
	}

}
