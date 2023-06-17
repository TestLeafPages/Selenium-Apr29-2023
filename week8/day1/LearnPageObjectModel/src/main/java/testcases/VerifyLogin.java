package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
       excelFilename="Login";		

	}
	@Test(dataProvider = "sendData")
	public void runLogin(String uName,String pWord) throws InterruptedException {
		System.out.println(driver);
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(uName).
		enterPassword(pWord).
		clickLoginButton().
		verifyHomePage();
		
		
		
//		lp.enterUsername();
//		lp.enterPassword();
//		lp.clickLoginButton();
//		
//		WelcomePage wp = new WelcomePage();
//		wp.verifyHomePage();
//		wp.clickCRMSFALink();
//		
//		MyHomePage hp = new MyHomePage();
//		hp.clickLeadsLink();
		
	}

}
