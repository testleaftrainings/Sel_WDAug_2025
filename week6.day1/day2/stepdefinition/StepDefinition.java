package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import hooksimplementation.HooksImp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass  {
	
	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		driver=new ChromeDriver(options);
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

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}
	
	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
		String text = driver.getTitle();
		if (text.contains("Leaftaps")) {
			System.out.println("homepage is displayed sucessfully");
			
		} else {
			System.out.println("homepage is not displayed sucessfully");

		}
		
	    
	}

	@When("Error msg is displayed")
	public void error_msg_is_displayed() {
	    String text1 = driver.findElement(By.id("errorDiv")).getText();
	    if (text1.contains("Errors")) {
	    	System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
	}

}
