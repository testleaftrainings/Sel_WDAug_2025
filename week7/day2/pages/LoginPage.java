package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
	@When("Enter the username as {string}")
	public LoginPage enterUserName(String uName) throws IOException {
		
		try {
			getDriver().findElement(By.id("username")).sendKeys(uName);
			reportStep("uname entered sucessfully","pass");
		} catch (Exception e) {
			reportStep("uname not entered sucessfully","fail");
			
		}
		
		return this;
		
	}
	
	@When("Enter the password as {string}")
	public LoginPage enterPassword(String pwd) throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys(pwd);
			reportStep("pwd entered sucessfully","pass");
			
		} catch (Exception e) {
			reportStep("pwd not entered sucessfully","fail");
			
		}
		return this;
		
	}
	@And("click on login button")
	public WelcomePage clickLogin() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("logged in sucessfully","pass");
		} catch (Exception e) {
			reportStep("not logged in sucessfully","fail");
			
		}
		return new WelcomePage();
	
}

}
