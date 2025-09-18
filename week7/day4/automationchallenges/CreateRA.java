package automationchallenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;



public class CreateRA {
	@Test(retryAnalyzer=automationchallenges.RetryAnalyser.class)
	public  void runCL() {
		
		
		  ChromeOptions opt=new ChromeOptions(); opt.addArguments("guest");
		  ChromeDriver driver = new ChromeDriver(opt);
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.findElement(By.id("usernam")).sendKeys("demoCSR");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		  driver.findElement(By.name("submitButton")).click(); driver.close();
		 
	}
		

}






