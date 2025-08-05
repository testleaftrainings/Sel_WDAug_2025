package hooksimplementation;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinition.BaseClass;

public class Hooks  extends BaseClass {
	//public static EdgeDriver driver;
	@Before
	public void preCondn() {
		 driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@After
	public void postCondn() {
		driver.close();
		
	}

}
