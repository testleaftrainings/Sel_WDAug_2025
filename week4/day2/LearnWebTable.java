package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/table.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//locate the table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
		//locate the rows
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		int size = rows.size();
		System.out.println(size);
		//locate the columns
		List<WebElement> colSize = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
		System.out.println(colSize.size());
		//retreive the particular data
		String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[3]/td[2]")).getText();
		System.out.println(text);
		//entire row
		List<WebElement> singleRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[3]/td"));
		for (int i = 0; i < singleRow.size(); i++) {
			WebElement sin = singleRow.get(i);
			System.out.println(sin.getText());
			
		}
		//print all the datas
		List<WebElement> allDatas = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td"));
		for (WebElement each : allDatas) {
			System.out.println(each.getText());
			
		}
		//dynamic datas
		for (int i = 1; i < rows.size(); i++) {
			driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
			System.out.println("-------------------");
			for (int j = 1; j < colSize.size(); j++) {
				WebElement datas = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(datas.getText());
			}
			
		}
		
		
	
	}

}
