package week2.day1;

public class LearnMethod {
	int noOfLearners=20;
	
	public void add() {
		int a=5,b=4;
		int c=a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		
		//how to instantiate the class?syntax:Classname obj=new classname();
		
		LearnMethod lm=new LearnMethod();
		lm.add();
		System.out.println(lm.noOfLearners);
		
		LearnMethods learn=new LearnMethods();
		learn.bicycleData("honda activa", "activa");
		
	}

}
