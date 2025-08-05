package stepDefinition;

import org.openqa.selenium.By;

import hooksimplementation.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass {
	
	@When("Click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	   
	}

	@When("click on leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	    
	}

	@When("click on createlead link")
	public void click_on_createlead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	    
	}

	@When("Enter the company name as (.*)$")
	public void enter_the_company_name(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	    
	    
	}

	@When("enter the first name as (.*)$")
	public void enter_the_first_name(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@When("Enter the last name as (.*)$")
	public void enter_the_last_name(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		
	    
	}

	@When("click on the leads button")
	public void click_on_the_leads_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("view leads page is displayed")
	public void view_leads_page_is_displayed() {
		String text = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
		if (text.contains("View Lead")) {
			System.out.println("view leads page is dispalyed");
		} else {
			System.out.println("view leads page is not dispalyed");
		}
		
	    
	}


}
