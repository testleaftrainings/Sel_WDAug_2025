package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	/**
	 * 
	 * check----1)element location
	 * 	        2)wait statements
	 * 			3)element is present inside the frame
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//switch to frame
		driver.switchTo().frame(0);//index starts from 0
		//click
		driver.findElement(By.id("Click")).click();
		

	}

}
