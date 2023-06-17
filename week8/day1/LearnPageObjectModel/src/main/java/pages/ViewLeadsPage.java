package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods{
	public ViewLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewLeadsPage verifyCreateLead() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;

	}

}
