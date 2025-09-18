package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
       Object testClass = result.getInstance();
	
        ChromeDriver driver = ((CreateLead) testClass).getDriver(); // cast to your test class
        try {
			ScreenShot.captureScreenshot(driver, result.getName());
		} catch (IOException e) {
			
		}
    }
}
