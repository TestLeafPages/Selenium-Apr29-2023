package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setValues() {
		excelFileName = "CreateLead";

	}

	@Test(dataProvider = "sendData")//(groups = {"Smoke","Regression"})//(invocationCount = 2,invocationTimeOut  = 20000)
	public void runCreateLead(String cName,String fName,String lName,String pNo) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
	
//	@DataProvider
//	public String[][] sendData() throws IOException {
//		 return ReadExcel.readExcel("CreateLead");
//		
//     //Create 2-dimensional array with rows and columns
//		/*
//		 * String[][] data = new String[2][4];
//		 * 
//		 * //1set of data data[0][0] = "TestLeaf"; data[0][1] = "Subraja"; data[0][2] =
//		 * "Subi"; data[0][3] = "91";
//		 * 
//		 * //2nd set of data data[1][0] = "QEagle"; data[1][1] = "Vidhya"; data[1][2] =
//		 * "R"; data[1][3] = "99";
//		 * 
//		 * return data;
//		 */
//		
//	}

}
