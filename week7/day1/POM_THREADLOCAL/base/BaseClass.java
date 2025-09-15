package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
//public static ChromeDriver driver;

private static final   ThreadLocal<ChromeDriver> cDriver=new ThreadLocal<ChromeDriver>();

	public void setDriver() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		cDriver.set(new ChromeDriver(options));
	
  }
	public ChromeDriver getDriver() {
		return cDriver.get();
	}
	
	@BeforeMethod
	public void preCondn() {
		setDriver();//driver is initialized
		
		//System.out.println("beforeMethod:"+driver);
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod
	public void postCondn() {
		getDriver().close();
		
	}


}
