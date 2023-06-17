package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterUsername(String uName) throws InterruptedException {
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys(uName);
//		LoginPage lp = new LoginPage();
//		return lp;
		return this;
		
	}

	public LoginPage enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
		return this;
	}

	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		//WelcomePage wp = new WelcomePage();
		return new WelcomePage(driver);
	}

}
