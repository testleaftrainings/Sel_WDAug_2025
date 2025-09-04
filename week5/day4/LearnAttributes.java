package integration;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test(priority=-2)
	public void createLead() {
		System.out.println("lead is created");
		
	}
	@Test(priority=1,invocationCount=3,invocationTimeOut=500)
	public void editLead() {
		System.out.println("lead is editted");
		
	}
	@Test(priority=-1)
	public void mergeLead() {
		System.out.println("lead is merged");
	
}
	@Test(enabled=false)
	public void deleteLead() {
		System.out.println("lead is deleted");
	
}
	@Test(priority=-3)
	public void duplicateLead() {
		System.out.println("lead is duplicated");
	
}


}
