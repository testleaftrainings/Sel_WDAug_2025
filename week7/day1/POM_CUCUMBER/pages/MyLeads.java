package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.When;

public class MyLeads extends BaseClass {
	
	
	@When("click on createleads link")
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

}
