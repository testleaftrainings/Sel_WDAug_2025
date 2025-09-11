package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	
	
	public LoginPage enterUserName() {
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		/*
		 * LoginPage lp=new LoginPage(); return lp;
		 */
		return this;
		
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		
	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	
}

}
