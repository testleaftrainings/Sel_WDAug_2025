package week6.day3;

public class LearnConstructor {
	/**
	 * Constructor:
	 * -used to initialize the objects
	 * -constructor name should be same as classname
	 * -difference b/w method and a constructor---constructor will not have return type
	 * types:
	 * 1)default:--->no args
	 * 2)parameterized constructor--->i/p args
	 * constructor overloading
	 * this:used to differentiate the global and local variable if it is having a same name in tha class 
	 * can you call one constructor from another constructor?
	 * yes--->constructor chaining--->this keyword
	 * 
	 */
	
	int empId;
	String empName;
	boolean empStatus;
	
	public LearnConstructor() {
		//this(45, "saran", true);
		System.out.println("default constructor");
		empId=90;
		
	}
	public LearnConstructor(int empId,String empName,boolean empStatus) {
		this();
		System.out.println("parameterized constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		  LearnConstructor lc1 =new LearnConstructor(56, "saran", true);
		  System.out.println(lc1.empId+" "+lc1.empName+" "+lc1.empStatus);
		 
		
		/*
		 * LearnConstructor lc =new LearnConstructor();
		 * System.out.println(lc.empId+" "+lc.empName+" "+lc.empStatus);
		 */
		
		
	}

}
