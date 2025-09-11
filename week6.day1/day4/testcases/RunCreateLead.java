package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass {
	@Test
	public void runCreateLead() {
		
		LoginPage l=new LoginPage(driver);
		l.enterUserName().enterPassword().clickLogin().clickCrmsfaLink().clickLeads().clickCreateLead().enterCompanyName().fName().lName().clickCreateLead().verifyLeads();
		
		
	}

}
