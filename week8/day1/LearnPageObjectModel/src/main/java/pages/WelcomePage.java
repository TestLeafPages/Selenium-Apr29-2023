package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{

	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	  public WelcomePage verifyHomePage() {
		  String title = driver.getTitle();
			if (title.contains("Leaftaps")) {
				System.out.println("Login successfull");
			}
			else {
				System.out.println("Login not successfull");
			}
        return this;

	}
	  
	  public MyHomePage clickCRMSFALink() {
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  return new MyHomePage(driver);
				  

	}
}
