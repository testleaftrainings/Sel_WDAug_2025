package week3.day1;

public class MethodOverriding extends MethodOverloading {
	public void add() {
		int a=89,b=35;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverriding mo=new MethodOverriding();
		mo.add();
	}
	
}
