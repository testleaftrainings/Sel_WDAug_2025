package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShot {

	public static void captureScreenshot(ChromeDriver driver,String methodName ) throws IOException {
		
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snapshot/"+methodName+".png");
		FileUtils.copyFile(src, dest);
		 System.out.println("Screenshot taken for: " + methodName);

	}

	

	
}
