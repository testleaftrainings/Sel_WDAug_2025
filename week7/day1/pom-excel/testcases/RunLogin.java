package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass{
	@BeforeTest
	public void setValues() {
		excelFileName="login";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runLogin(String uName,String pwd) {
		//System.out.println(driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uName).enterPassword(pwd).clickLogin().clickCrmsfaLink();
	}

}
