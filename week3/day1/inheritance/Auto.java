package week3.day1;

public class Auto extends Vehicle {
	
	public void applyMeter() {
		System.out.println("meter is applied---->Auto class");
	}
	public static void main(String[] args) {
		Auto A =new Auto();
		A.applyBreak();
		A.applyMeter();
	}

}
