package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		
		/**steps to handle the dropdown
		 * 1)identify whether the dropdown element is present inside the<select>
		 * 2)if the DD is <select>,locate the element and store this in a variable
		 */
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.partialLinkText("SFA")).click();
		//leads
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//createlead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(source);
		sel.selectByValue("LEAD_DIRECTMAIL");
		

	}

}
