package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {
	@Test(dataProvider="fetchData")
	public  void runCreateLead (String cName,String fName,String lName) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="fetchData",parallel=true)
	public String[][] sendData() {
		//declare 2D array
		//first[]--->row
		//second[]--->column
		
		String[][] data=new String[3][3];
		//assign data for the 2D array
		data[0][0]="Testleaf";
		data[0][1]="Saranya";
		data[0][2]="S";
		
		data[1][0]="Testleaf";
		data[1][1]="Hari";
		data[1][2]="R";
		
		data[2][0]="Testleaf";
		data[2][1]="Seenivasan";
		data[2][2]="S";
		return data;
				
		
	}
}






