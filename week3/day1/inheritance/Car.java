package week3.day1;

public class Car extends Vehicle {
	
	public void applyGear() {
		System.out.println("gear is applied----->carclass");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.applyGear();
		c.applyBreak();
		c.soundHorn();
		
	}

}
