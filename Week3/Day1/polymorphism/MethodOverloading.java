package week3.day1;

public class MethodOverloading {
	
	/**
	 * overloading:
	 * 1)the method signature is same but with different i/p args.
	 * 2)static/compiletime/early binding
	 * 
	 */
	
	public void add() {
		int a=2,b=3;
		System.out.println(a+b);
	}
	public void add(int a ,int b) {
		System.out.println(a+b);
		
	}
	public void add(int b ,int a,float c) {
		System.out.println(a+b+c);
		
	}
	/*
	 * public void add(int b ,float c,int a) { System.out.println(a+b);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		MethodOverloading lo=new MethodOverloading();
		lo.add();
	}

}
