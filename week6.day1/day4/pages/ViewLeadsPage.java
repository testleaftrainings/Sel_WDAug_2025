package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadsPage extends BaseClass {
	
	public ViewLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewLeadsPage verifyLeads() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("saran")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
		return this;
	}

}
