package week3.day1;

public class BMW extends Car {
	
	public void voiceCommand() {
		System.out.println("voicecmd is enabled---->bmw class");
	}
	public void turnOnAc() {
		System.out.println("Ac is turned on---->bmw class");
	}
	public static void main(String[] args) {
		BMW B=new BMW();
		B.applyBreak();
		B.applyGear();
		B.soundHorn();
		B.turnOnAc();

	}

}
