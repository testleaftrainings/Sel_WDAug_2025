package integration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		/*
		 * driver.findElement(By.xpath("//span[text()='Click']")).click();
		 * System.out.println("completed");
		 */
		
		//instantiate webdriverwait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement firstEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		
		firstEle.click();
		
		WebElement visible = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
boolean displayed = visible.isDisplayed();
System.out.println(displayed );

WebElement secondEle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[2]")));
secondEle.click();
	}

}
