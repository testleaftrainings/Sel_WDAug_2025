package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public EdgeDriver driver;
	@BeforeSuite
	public void startReports() {
		System.out.println("reports started");
		
	}
	@BeforeClass
	public void testCaseDetails() {
		System.out.println("testcase details aer assigned");
		
	}
	@BeforeTest
	public void setValues() {
		System.out.println("values are set");
		
		
	}
	
	@BeforeMethod
	public void preCondns() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postCondns() {
		driver.close();
		
	}
	@AfterSuite
	public void stopReports() {
		System.out.println("stop the reports");
		
	}

}
