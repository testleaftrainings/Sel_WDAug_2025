package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
		
	}
	public CreateLeadPage fName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saran");
		return this;
		
	}
	public CreateLeadPage lName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		return this;
	
}
	public ViewLeadsPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
		
	
}

}
