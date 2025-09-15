package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
	@When("Enter the username as {string}")
	public LoginPage enterUserName(String uName) {
		//System.out.println(getgetDriver()());
		getDriver().findElement(By.id("username")).sendKeys(uName);
		
		return this;
		
	}
	
	@When("Enter the password as {string}")
	public LoginPage enterPassword(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
		
	}
	@And("click on login button")
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	
}

}
