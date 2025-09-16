package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass{
	
	@When("enter the company name as(.*)$")
	public CreateLeadPage enterCompanyName(String uName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(uName);
		return this;
		
	}
	@When("enter the firstname as(.*)$")
	public CreateLeadPage fName(String fName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
		
	}
	@When("enter the lastname as(.*)$")
	public CreateLeadPage lName(String lName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	
}
	@When("click on createLead")
	public ViewLeadsPage clickCreateLead() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
		
	
}

}
