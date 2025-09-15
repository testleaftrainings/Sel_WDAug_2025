package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass {
	@BeforeTest
	public void setValues() {
		excelFileName="createLead";
		
	}
	@Test(dataProvider="fetchData")
	public void runCreateLead(String uName,String pwd,String cName,String fName,String lName) {
		
		LoginPage l=new LoginPage(driver);
		l.enterUserName(uName).enterPassword(pwd).clickLogin().clickCrmsfaLink().clickLeads().clickCreateLead().enterCompanyName(cName).fName(fName).lName(lName).clickCreateLead().verifyLeads();
		
		
	}

}
