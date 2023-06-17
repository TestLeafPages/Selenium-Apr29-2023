package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class RunCreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		excelFilename="CreateLead";

	}
	@Test(dataProvider="sendData")
	public void runCreateLead(String uName,String pWord,String cName,String fName,String lName) throws InterruptedException {
         LoginPage lp = new LoginPage(driver);
         lp.enterUsername(uName)
         .enterPassword(pWord)
         .clickLoginButton()
         .verifyHomePage()
         .clickCRMSFALink()
         .clickLeadsLink()
         .clickCreateLeadButton()
         .enterCompanyName(cName)
         .enterFirstName(fName)
         .enterLastName(lName)
         .clickSubmitButton()
         .verifyCreateLead();

	}

}
