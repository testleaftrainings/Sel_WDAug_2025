package week2.day1;

public class LearnMethods {
	
	/**
	 * Method signature:
	 * AccessModifier returntype mthdname(parameters)
	 */
	
	public void addNumbers(int a,int b,float c){
		System.out.println(a+b+c);
		
	}
	
	private int noOfBicycles(){
		
		return 2;
		
	}
	
	String bicycleData(String brandName,String colour){
		return brandName+" "+colour;
		
	}
	
	public static void main(String[] args) {
		LearnMethods lm1=new LearnMethods();
		lm1.addNumbers(5, 6, 3.3f);
		
		int bicy = lm1.noOfBicycles();//ctrl+2,L
		System.out.println(bicy);
		System.out.println(lm1.bicycleData("honda", "red"));
	}

}
