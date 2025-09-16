package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.CommonExcelIntegration;

public class BaseClass extends AbstractTestNGCucumberTests {
	public String excelFileName,testName,testDescription,testAuthor,testCategory;
	public static ExtentTest test;
	public static ExtentReports extent;

	@BeforeSuite
	public void startReports() {
			ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
			reporter.setAppendExisting(true);
			 extent=new ExtentReports();
			extent.attachReporter(reporter);
	}
	@BeforeClass
	public void testCaseDetails() {
       test=extent.createTest(testName,testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}

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
	public void reportStep(String msg,String status) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
			
		} else if(status.equalsIgnoreCase("fail")) {
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
			throw new RuntimeException("verify reports");

		}
		
	}
	
	public int takeSnap() throws IOException {
		int ranNum=(int)(Math.random() *999999 + 999999);
		File source = getDriver().getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img"+ranNum+".png");
		FileUtils.copyFile(source, dest);
		return ranNum;
	}
	@AfterSuite
	public void stopReports() {
		extent.flush();
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return CommonExcelIntegration.readData(excelFileName);
		
	}

}
