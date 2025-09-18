package automationchallenges;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowStrat {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps/");
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.navigate().to("https://www.myntra.com/");
		  
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  driver.navigate().to("https://www.ajio.com/");

	}

}
