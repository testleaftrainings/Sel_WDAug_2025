package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods {
	
	public Login enteruName(String uName) {
		
		WebElement user = locateElement(Locators.XPATH, "//input[@id='username']");
		clearAndType(user, uName);
		
		//clearAndType(locateElement("username"),uName);
		reportStep("uname entered sucessfully","pass");
		return this;
		
	}
	
	public Login enterPassword(String pwd) {
		clearAndType(locateElement("password"),pwd );
		reportStep("uname entered sucessfully","pass");
		return this;
		
	}
	
	public WelcomePage clickLogin() {
		click(locateElement("Login"));
		reportStep("logged in sucessfully","pass");
		return new WelcomePage();
		
	}

}
