package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewLeadsPage extends BaseClass {
	
	
	@Then("viewleadspage is displayed")
	public ViewLeadsPage verifyLeads() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("saran")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
		return this;
	}

}
