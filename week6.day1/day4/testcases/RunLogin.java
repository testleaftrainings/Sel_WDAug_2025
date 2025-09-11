package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.WelcomePage;

public class RunLogin extends BaseClass{
	
	@Test
	public void runLogin() {
		System.out.println(driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLogin().clickCrmsfaLink();
	}

}
