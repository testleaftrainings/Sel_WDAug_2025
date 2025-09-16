package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass {
	
	
	@When("click on leads link")
	public MyLeads clickLeads() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeads();
	}

}
