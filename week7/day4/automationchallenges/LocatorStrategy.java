package automationchallenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorStrategy {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions(); 
		opt.addArguments("guest");
		  ChromeDriver driver = new ChromeDriver(opt);
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		  driver.findElement(By.xpath("(//label[text()='Username']/following::input)[1]")).sendKeys("demoCSR");

	}

}
