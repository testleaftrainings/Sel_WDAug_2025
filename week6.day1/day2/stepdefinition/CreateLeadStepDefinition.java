package stepdefinition;

import org.openqa.selenium.By;

import hooksimplementation.HooksImp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass {
	
	
	@When("click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	    
	}

	@When("click on leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	    
	}

	@When("click on createleads link")
	public void click_on_createleads_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	    
	}

	@When("enter the company name as (.*)$")
	public void enter_the_company_name_as_testleaf(String uName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(uName);
	    
	}

	@When("enter the firstname as (.*)$")
	public void enter_the_firstname_as_saranya(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	    
	}

	@When("enter the lastname as (.*)$")
	public void enter_the_lastname_as_s(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	    
	}

	@When("click on createLead")
	public void click_on_create_lead() {
		driver.findElement(By.name("submitButton")).click();
	    
	}

	@Then("viewleadspage is displayed")
	public void viewleadspage_is_displayed() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("Saranya")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
	    
	}

}
