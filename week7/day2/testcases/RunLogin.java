package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLogin extends BaseClass{
	@BeforeTest
	public void setValues() {
		excelFileName="login";
		testName="login";
		testDescription="login with positive credentials";
		testAuthor="saranya";
		testCategory="regression";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void runLogin(String uName,String pwd) throws IOException {
		//System.out.println(driver);
		LoginPage lp=new LoginPage();
		lp.enterUserName(uName).enterPassword(pwd).clickLogin().clickCrmsfaLink();
	}

}
