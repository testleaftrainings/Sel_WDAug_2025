package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import hooksimplementation.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}

	@When("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	    
	}

	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	    
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}
	
	
	@Then("homepage should be dispalyed")
	public void homepage_should_be_dispalyed() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
	    
	}
	@When("Error msg is displayed")
	public void error_msg_is_displayed() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if (text.contains("Errors")) {
			System.out.println("text same");
			
		} else {
			System.out.println("text not same");

		}
	    
	}

}
