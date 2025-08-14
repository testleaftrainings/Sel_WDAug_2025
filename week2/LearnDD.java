package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDD {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		//maximize the window
		driver.manage().window().maximize();
		//locate the element
		WebElement selectDD = driver.findElement(By.className("ui-selectonemenu"));
		selectDD.click();
		//instantiate the select class
		Select sel=new Select(selectDD);
		sel.selectByVisibleText("Selenium");
		//sel.selectByIndex(1);
		
		
		
	}

}
