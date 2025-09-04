package integration;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//takesnapshot
		 File source = driver.getScreenshotAs(OutputType.FILE);
		 //destination
		 File destination=new File("./snap/homepage.png");
		 //connect source and destination
		 FileUtils.copyFile(source, destination);
		 
		 //particular textfield
		 WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		 File source1 = searchField.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./snap/search.png");
		 FileUtils.copyFile(source1, dest);
		

	}

}
