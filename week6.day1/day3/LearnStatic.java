package week6.day3;

public class LearnStatic {
	
	static int x;//static
	String name;//non static
	
	public static void print() {
		System.out.println("printed");
	}
	public void write() {
		System.out.println("written and completed");
	}

	public static void main(String[] args) {
		System.out.println(x);
		//LearnStatic l=new LearnStatic();
				
		//System.out.println(l.name);
		print();
		
		
	

	}

}
