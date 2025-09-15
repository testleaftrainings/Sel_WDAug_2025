package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.CommonExcelIntegration;

public class BaseClass {
public  ChromeDriver driver;
public String excelFileName;
	
	@BeforeMethod
	public void preCondn() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		driver=new ChromeDriver(options);
		System.out.println("beforeMethod:"+driver);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod
	public void postCondn() {
		driver.close();
		
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return CommonExcelIntegration.readData(excelFileName);
	}


}
