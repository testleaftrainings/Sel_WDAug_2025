package week6.day3;

public class LearnFinally {

	public static void main(String[] args) {
		int x=8;
		int y=0;
		int num[]= {1,2,3};
		
		  try { 
			  System.out.println(x/y);
		  
		  }
			
			  catch (ArithmeticException e) { System.out.println(e);
			  
			  }
			 
		  finally {
			  System.out.println("completed finally");
		  }
		  System.out.println("done");
	}

}
