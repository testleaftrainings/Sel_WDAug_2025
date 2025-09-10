package week6.day3;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		int x=8;
		int y=0;
		int num[]= {1,2,3};
		
		  try { 
			  System.out.println(x/y);
			  System.out.println(num[3]);
		  
		  }
		  catch (ArithmeticException e) {
			System.out.println(e);
			
		}
		 catch (Exception e) {
			
			System.out.println(e);
		}
		System.out.println("completed");

	}

}
